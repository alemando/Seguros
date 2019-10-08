package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise


case class Bien(id: String, documentacionIndentidadCliente: String, nombreCategoria: String, 
caracteristicas: String, documentos:String = "") {
   def toBean = {
        val bien = new BienBean()
        bien.id = id
        bien.documentacionIndentidadCliente = documentacionIndentidadCliente
        bien.nombreCategoria = nombreCategoria
        bien.caracteristicas = caracteristicas
        bien.documentos = documentos
        bien
    }
}


//Clase plana, la base de datos solo recibe clases planas

class BienBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var id: String = null
    @BeanProperty var documentacionIndentidadCliente: String = null
    @BeanProperty var nombreCategoria: String = null
    @BeanProperty var caracteristicas: String = null
    @BeanProperty var documentos: String = null
        
   //Convierte clase plana a clase case
    def toCase: Bien = {
        Bien(id,documentacionIndentidadCliente,nombreCategoria,caracteristicas,documentos)
    }
}

//En caso de error al consultar la base de datos

case class BienNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Bien{
  
    def create(bien: Bien) = {
        val ref  = Conexion.ref(s"bienes/${bien.id}")
        val bienesRecord = bien.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(bienesRecord, new DatabaseReference.CompletionListener() {
            override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
                if(databaseError != null){
                    print(databaseError)
                }else{
                    print(databaseReference)
                }
            }
        })
    }
    
    def obtenerPorId(id: String): Option[Bien] = {
      val ref = Conexion.ref(s"bienes/$id")                   //Se establece la conexión
      val bienRecibido = Promise[Bien]                        //Se "promete" la entrega de un objeto Bien
      ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
        override def onDataChange(snapshot: DataSnapshot) = {
          val bienBD: BienBean =snapshot.getValue(classOf[BienBean])
          if(bienBD != null){                                    //Comprueba que si haya recibido el Bien en formato plano
            bienRecibido.success(bienBD.toCase)               //To Case para parsear el formato plano
          } else{
            bienRecibido.failure(BienNotFoundException(s"Bien $id no encontrado")) //En caso de error
          }
        }
        override def onCancelled(databaseError: DatabaseError)={
          println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
        }
      })
      val bienFuture = bienRecibido.future                    //Lo parsea a un Future
      Thread.sleep(10000)                                            //Tiempo de espera para la respuesta de sus exámenes
      val bienOption :Option[Bien] = {if(bienFuture.isCompleted){bienFuture.value.get.toOption}else{None}}
      bienOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }
}