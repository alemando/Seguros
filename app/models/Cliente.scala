package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise

//Creación de la clase cliente como tal
case class Cliente(val documento:String,val nombre:String,val apellido1:String,val apellido2:String,var pdireccion:String,var pdatosResidencia:String,var pdatosContacto:String,val fechaNacimiento:String,var pingresos:Int, var pegresos:Int){
  //Getters
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
  //para poder ser recibida en la base de datos.
  def toBean={
    val cliente= new ClienteBean()
    cliente.documento=documento
    cliente.nombre=nombre
    cliente.appelido1=apellido1
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

//companion object, las comprobaciones las podemos hacer aquí
object Cliente{
  def apply(documento:String,nombre:String,apellido1:String,apellido2:String,direccion:String,datosResidencia:String,datosContacto:String,fechaNacimiento:String,ingresos:Int,egresos:Int):Boolean={
    //Cliente(documento,nombre,direccion,datosResidencia,datosContacto,fechaNacimiento,ingresos,egresos)
    if(ingresos<0){
      false
    }
    else{
      var client=Cliente(documento,nombre,apellido1,apellido2,direccion,datosResidencia,datosContacto,fechaNacimiento,ingresos,egresos)
      true
    }
  }
  //Me crea un cliete en la base de datos
  def create(cliente: Cliente) = {
    val ref  = Conexion.ref(s"clientes/${cliente.documento}")
    val clienteRecord = cliente.toBean
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
class ClienteBean(){
  @BeanProperty var documento:String=null
  @BeanProperty var nombre:String=null
  @BeanProperty var appelido1:String=null
  @BeanProperty var apellido2:String=null
  @BeanProperty var pdireccion:String=null
  @BeanProperty var pdatosResidencia:String=null
  @BeanProperty var pdatosContacto:String=null
  @BeanProperty var fechaNacimiento:String=null
  @BeanProperty var pingresos:String=null
  @BeanProperty var pegresos:String=null

  def toCase:Cliente={
      new Cliente(documento,nombre,appelido1,apellido2,pdireccion,pdatosResidencia,pdatosContacto,fechaNacimiento,pingresos.toInt,pegresos.toInt)
  }
}