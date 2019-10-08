package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise

//Creación de la clase cliente 
case class Cliente( documento:String, nombre:String, apellido1:String, apellido2:String, pdireccion:String, 
pdatosResidencia:String, pdatosContacto:String, fechaNacimiento:String, pingresos:Int,  pegresos:Int){
  /*//Getters
  //Estas variables decidí empezarlas con p para decir que son privadas, pues BeanProperty me ponia problema si usaba _
  def direccion=pdireccion
  def datosResidencia=pdatosResidencia
  def datosContacto=pdatosContacto
  def ingresos=pingresos
  def egresos=pegresos
  
  //Setters
  def setDireccion_=(direccion:String)=pdireccion
  def setResidencia_=(datosResidencia:String)=pdatosResidencia
  def setDatosContacto_=(datosContacto:String)=pdatosContacto
  def setIngresos_=(ingresos:Int)=pingresos
  def setEgresos_=(egresos:Int)=pegresos
  
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
    cliente.pingresos=pingresos.toString()
    cliente.pegresos=pegresos.toString()
    cliente
  }
}
//Excepcion dada si no se encuentra el cliente en la base de datos
case class ClienteNotFoundException(s:String) extends Exception(s)

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
      new Cliente(documento,nombre,apellido1,apellido2,pdireccion,pdatosResidencia,pdatosContacto,fechaNacimiento,pingresos.toInt,pegresos.toInt)
  }
}

//companion object, las comprobaciones las podemos hacer aquí

object Cliente{
  //Método apply donde podemos hacer comprobaciones, además muchas instancias de cliente se crean usando este método.
  /*def apply(documento:String, nombre:String, apellido1:String, apellido2:String, direccion:String, 
  datosResidencia:String, datosContacto:String, fechaNacimiento:String, ingresos:Int, egresos:Int) = {
    if(ingresos<0){
      null
    }
    else{
      Cliente(documento,nombre,apellido1,apellido2,direccion,datosResidencia,datosContacto,fechaNacimiento,ingresos,egresos)
    }
  }*/
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
  
  //Método para obtener un Cliente por su cédula (Clave primaria)
  def obtenerPorCedula(cedula: String): Option[Cliente] = {
    val ref = Conexion.ref(s"clientes/$cedula")                   //Se establece la conexión
    val clienteRecibido = Promise[Cliente]                        //Se "promete" la entrega de un objeto Cliente
    ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
      override def onDataChange(snapshot: DataSnapshot) = {
        val clienteBD: ClienteBean =snapshot.getValue(classOf[ClienteBean])
        if(clienteBD != null){                                    //Comprueba que si haya recibido el Cliente en formato plano
          clienteRecibido.success(clienteBD.toCase)               //To Case para parsear el formato plano
        } else{
          clienteRecibido.failure(ClienteNotFoundException(s"Cliente $cedula no encontrado")) //En caso de error
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
}
//Cliente Bean sirve para volver normal a una clase case y poder meterla a la base de datos
