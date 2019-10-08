package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise

case class Categoria(nombre: String){
    def toBean = {
        val categoria = new CategoriaBean()
        categoria.nombre = nombre
        categoria
    }
}

//Clase plana, la base de datos solo recibe clases planas
class CategoriaBean(){
    //Autogenera los setter y getter con el Bean Property
    @BeanProperty var nombre: String = null
    
    //Convierte clase plana a clase case
    def toCase: Categoria = {
        Categoria(nombre)
    }
}

//En caso de error al consultar la base de datos
case class CategoriaNotFoundException(s: String) extends Exception(s)

//Object donde estaran los metodos y atributos de clase
object Categoria{
    def create(categoria: Categoria) = {
        val ref  = Conexion.ref(s"categorias/${categoria.nombre}")
        val categoriaRecord = categoria.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(categoriaRecord, new DatabaseReference.CompletionListener() {
            override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
                if(databaseError != null){
                    print(databaseError)
                }else{
                    print(databaseReference)
                }
            }
        })
    }
    
        //Método para obtener una Categoria por su nombre (Clave primaria)
  def obtenerPorNombre(nombre: String): Option[Categoria] = {
    val ref = Conexion.ref(s"categorias/$nombre")                   //Se establece la conexión
    val categoriaRecibida = Promise[Categoria]                        //Se "promete" la entrega de un objeto Categoria
    ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
      override def onDataChange(snapshot: DataSnapshot) = {
        val categoriaBD: CategoriaBean =snapshot.getValue(classOf[CategoriaBean])
        if(categoriaBD != null){                                    //Comprueba que si haya recibido la Categoria en formato plano
          categoriaRecibida.success(categoriaBD.toCase)               //To Case para parsear el formato plano
        } else{
          categoriaRecibida.failure(CategoriaNotFoundException(s"Categoria $nombre no encontrada")) //En caso de error
        }
      }
      override def onCancelled(databaseError: DatabaseError)={
        println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
      }
    })
    val categoriaFuture = categoriaRecibida.future                    //Lo parsea a un Future
    Thread.sleep(10000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val categoriaOption :Option[Categoria] = {if(categoriaFuture.isCompleted){categoriaFuture.value.get.toOption}else{None}}
    categoriaOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }
}