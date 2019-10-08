package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise
import scala.util.matching.Regex
import scala.collection.mutable.ArrayBuffer
//Creación de la clase cliente 
case class Cliente( documento:String, nombre:String, apellido1:String, apellido2:String, pdireccion:String, 
pdatosResidencia:String, pdatosContacto:String, fechaNacimiento:String, pingresos:String,  pegresos:String){

  //Este método me regresa un clienteBean, lo que hace es convetir esta clase case, en una plana
  //para poder ser recibida en la base de datos.*/
  def toBean={
    val cliente= new ClienteBean()
    cliente.documento=documento
    cliente.nombre=nombre
    cliente.apellido1=apellido1
    cliente.apellido2=apellido2
    cliente.pdireccion=pdireccion
    cliente.pdatosResidencia=pdatosResidencia
    cliente.pdatosContacto=pdatosContacto
    cliente.fechaNacimiento=fechaNacimiento
    cliente.pingresos=pingresos
    cliente.pegresos=pegresos
    cliente
  }
}
//Excepcion dada si no se encuentra el cliente en la base de datos
case class ClienteNotFoundException(s:String) extends Exception(s)

//Cliente Bean sirve para volver normal a una clase case y poder meterla a la base de datos
class ClienteBean(){
  @BeanProperty var documento:String=null
  @BeanProperty var nombre:String=null
  @BeanProperty var apellido1:String=null
  @BeanProperty var apellido2:String=null
  @BeanProperty var pdireccion:String=null
  @BeanProperty var pdatosResidencia:String=null
  @BeanProperty var pdatosContacto:String=null
  @BeanProperty var fechaNacimiento:String=null
  @BeanProperty var pingresos:String=null
  @BeanProperty var pegresos:String=null

  //Este método me convierte una clase Bean en una normal, para poder manejarlas con fácilidad en scala.
  //Es usado cuando obtenemos elementos de la base de datos y los tenemos que interpretar como case classes.
  def toCase:Cliente={
      new Cliente(documento,nombre,apellido1,apellido2,pdireccion,pdatosResidencia,pdatosContacto,fechaNacimiento,pingresos,pegresos)
  }
}

//companion object, las comprobaciones las podemos hacer aquí

object Cliente{
  //Me crea un cliete en la base de datos
  def create(cliente: Cliente) = {
    val ref  = Conexion.ref(s"clientes/${cliente.documento}")//conexión con la base de datos
    val clienteRecord = cliente.toBean //usamos a clienteBean
    ref.setValue(clienteRecord, new DatabaseReference.CompletionListener() {
        override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
            if(databaseError != null){
                print(databaseError)
            }else{
                print(databaseReference)
            }
        }
    })
  }
  //Cliente(documento,nombre,apellido1,apellido2,direccion,datosResidencia,datosContacto,fechaNacimiento,ingresos,egresos)
  def verificacion(documento:String,nombre:String,apellido1:String,apellido2:String,numContacto:String,fechaNacimiento:String,ingresos:String,egresos:String): (Boolean,String) = {
    //expresion regular para verificar si todo son numeros
    val numberPattern: Regex = "^[\\d\\s]+$".r
    //expresion regular para verificar si todo son lertas
    val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
    //expresion regular para verificar si cumple con el formato de fecha
    val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
    //variables que guardan en su caso el match con la expresion regular
    val matchesDocumento = numberPattern.findAllIn(documento)
    val matchesContacto = numberPattern.findAllIn(numContacto)
    val matchesIngresos = numberPattern.findAllIn(ingresos)
    val matchesEgresos = numberPattern.findAllIn(egresos)
    val matchesFechaNacimiento = datePatter.findAllIn(fechaNacimiento)
    // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
    if (matchesDocumento.size == 0 || matchesContacto.size == 0 || matchesIngresos.size == 0 || matchesEgresos.size==0){
        return(false,"Esto no es un numero o no es positivo el numero")
    }
    val matchesnombre = letterPattern.findAllIn(nombre)
    val matchesappellido1 = letterPattern.findAllIn(apellido1)
    val matchesappellido2 = letterPattern.findAllIn(apellido2)

    if (matchesnombre.size == 0 || matchesappellido1.size == 0 || matchesappellido2.size == 0){
        return(false,"Esto no es un caracter")
    }
    if(matchesFechaNacimiento.size==0){
      return(false,"Formato de fecha no válida")
    }
    return(true, "correcto")
  }
  //Método para obtener una lista de clientes
  //El funcionamiento de este método es similar al método que obtiene un cliente de manera individual pero usa el método
  //orderByChild para obtener un listado
  def obtenerClientes(propiedad: String = "documento"):Option[ArrayBuffer[Cliente]]={
    val promesa:Promise[ArrayBuffer[Cliente]]= Promise[ArrayBuffer[Cliente]]
    val ref = Conexion.ref("clientes")
    ref.orderByChild(propiedad).addListenerForSingleValueEvent(new ValueEventListener(){
      override def onDataChange(snapshot: DataSnapshot) = {
        val listaClientes: ArrayBuffer[Cliente] = ArrayBuffer()
        snapshot.getChildren.forEach(listaClientes += _.getValue(classOf[ClienteBean]).toCase) //Se usa un foreach para iterar en cada elemento traído y luego se guarda en un ArrayBuffer
        promesa.success(listaClientes)
      }
      override def onCancelled(databaseError: DatabaseError) = {
        println(databaseError.getMessage)
      }
    })
    val future: Future[ArrayBuffer[Cliente]]=promesa.future
    Thread.sleep(3000)
    val option: Option[ArrayBuffer[Cliente]] = {if(future.isCompleted){future.value.get.toOption}else{None}}
    option
  } 

  def obtenerPorDocumento(documentoIdentidad: String): Option[Cliente] = {
    val ref = Conexion.ref(s"clientes/$documentoIdentidad")                   //Se establece la conexión
    val clienteRecibido = Promise[Cliente]                        //Se "promete" la entrega de un objeto Aseguradora
    ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
      override def onDataChange(snapshot: DataSnapshot) = {
        val clientesBD: ClienteBean =snapshot.getValue(classOf[ClienteBean])
        if(clientesBD != null){                                    //Comprueba que si haya recibido la Aseguradora en formato plano
          clienteRecibido.success(clientesBD.toCase)               //To Case para parsear el formato plano
        } else{
          clienteRecibido.failure(ClienteNotFoundException(s"Cliente $documentoIdentidad no encontrada")) //En caso de error
        }
      }
      override def onCancelled(databaseError: DatabaseError)={
        println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
      }
    })
    val clienteFuture = clienteRecibido.future                    //Lo parsea a un Future
    Thread.sleep(10000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val clienteOption :Option[Cliente] = {if(clienteFuture.isCompleted){clienteFuture.value.get.toOption}else{None}}
    clienteOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }

  //Esta parte se supone que crea un método para devolver un objeto de la base de datos, sin embargo aún no funciona
  //Pues tengo problemas con el manejo del promise.
}
