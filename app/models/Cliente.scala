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

   //este metodo lo que hace es verificar los datos sean correctos por medio de expresiones regulares
  def verificacion(documento:String, nombre:String, apellido1:String, apellido2:String, pdireccion:String, 
pdatosResidencia:String, pdatosContacto:String, fechaNacimiento:String, pingresos:Int,  pegresos:Int): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
      // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
      val matchesdocumento = numberPattern.findAllIn(documento)
      val matchesdatcont = numberPattern.findAllIn(pdatosContacto)
      val matchesingresos = numberPattern.findAllIn(pingresos)
      val matchesegresos = numberPattern.findAllIn(pegresos)
      if (matchesdocumento.size == 0 || matchesdatcont.size == 0 || matchesegresos.size == 0 || matchesingresos.size == 0){
          return(false,"Esto no es un numero o no es positivo el numero")
      }

      val matchesnombre = letterPattern.findAllIn(nombre)
      val matchesapp1 = letterPattern.findAllIn(apellido1)
      val matchesapp2 = letterPattern.findAllIn(apellido2)
      val matchesdireccion = letterPattern.findAllIn(pdireccion)
      val matchesresidencia = letterPattern.findAllIn(pdatosResidencia)
  
      if (matchesnombre.size == 0 || matchesapp1.size == 0 || matchesapp2.size == 0 || matchesdireccion.size == 0 || matchesresidencia.size == 0){
          return(false,"Esto no es un caracter")
      }

      val matchesfecha = datePatter.findAllIn(fechaNacimiento)
      if(matchesfecha.size == 0){
        return(false, "Esto no es una fecha")
      }
      return(true, "correcto")

  }
  
  //Esta parte se supone que crea un método para devolver un objeto de la base de datos, sin embargo aún no funciona
  //Pues tengo problemas con el manejo del promise.
  /*
  def get(documento:String):Future[Cliente]={
    val ref=Conexion.ref(s"clientes/$documento")
    val p= new Promise[Cliente]
    ref.addListenerForSingleValueEvent(new ValueEventListener(){
      override def onDataChange(snapshot:DataSnapshot)={
        val clienteRecord:ClienteBean=snapshot.getValue(classOf[ClienteBean])
        if(clienteRecord!=null){
          p.setValue(clienteRecord.toCase)
        }
        else{
          p.setException(ClienteNotFoundException(s"El documento del cliente no fue encontrado"))
        }
      }
      override def onCancelled(databaseError:DatabaseError)={
        p.setException(FirebaseException(databaseError.getMessage))
      }
    })
    p
  }
}""""*/
}
//Cliente Bean sirve para volver normal a una clase case y poder meterla a la base de datos
