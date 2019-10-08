package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise


case class Credencial(documentoIdentidadVendedor: String, usuario: String,contrasena: String) {
   def toBean = {
        val credencial = new CredencialBean()
        credencial.documentoIdentidadVendedor = documentoIdentidadVendedor
        credencial.usuario = usuario
        credencial.contrasena = contrasena
        credencial
    }
}


//Clase plana, la base de datos solo recibe clases planas

class CredencialBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var documentoIdentidadVendedor: String = null
    @BeanProperty var usuario: String = null
    @BeanProperty var contrasena: String = null
        
   //Convierte clase plana a clase case
    def toCase: Credencial = {
        Credencial(documentoIdentidadVendedor, usuario, contrasena)
    }
}

//En caso de error al consultar la base de datos

case class CredencialNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Credencial{
  
    def create(credencial: Credencial) = {
        val ref  = Conexion.ref(s"credenciales/${credencial.documentoIdentidadVendedor}")
        val credencialRecord = credencial.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(credencialRecord, new DatabaseReference.CompletionListener() {
            override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
                if(databaseError != null){
                    print(databaseError)
                }else{
                    print(databaseReference)
                }
            }
        })
    }
    
        //Método para obtener un Vendedor por su cédula (Clave primaria)
  def obtenerPorCedulaVendedor(cedula: String): Option[Credencial] = {
    val ref = Conexion.ref(s"credenciales/$cedula")                   //Se establece la conexión
    val credencialRecibida = Promise[Credencial]                        //Se "promete" la entrega de un objeto Credencial
    ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
      override def onDataChange(snapshot: DataSnapshot) = {
        val credencialBD: CredencialBean =snapshot.getValue(classOf[CredencialBean])
        if(credencialBD != null){                                    //Comprueba que si haya recibido el Vendedor en formato plano
          credencialRecibida.success(credencialBD.toCase)               //To Case para parsear el formato plano
        } else{
          credencialRecibida.failure(CredencialNotFoundException(s"Credencial del vendedor $cedula no encontrada")) //En caso de error
        }
      }
      override def onCancelled(databaseError: DatabaseError)={
        println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
      }
    })
    val credencialFuture = credencialRecibida.future                    //Lo parsea a un Future
    Thread.sleep(10000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val credencialOption :Option[Credencial] = {if(credencialFuture.isCompleted){credencialFuture.value.get.toOption}else{None}}
    credencialOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }
}