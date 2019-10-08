package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise


case class Aseguradora(nit: String, nombre: String,contacto:String){
    def toBean = {
        val aseguradora = new AseguradoraBean()
        aseguradora.nit = nit
        aseguradora.nombre = nombre
        aseguradora.contacto = contacto
        aseguradora
    }
}

//Clase plana, la base de datos solo recibe clases planas
class AseguradoraBean(){
    //Autogenera los setter y getter con el Bean Property
    @BeanProperty var nit: String = null
    @BeanProperty var nombre: String = null
    @BeanProperty var contacto: String = null

    //Convierte clase plana a clase case
    def toCase: Aseguradora = {
        Aseguradora(nit, nombre,contacto)
    }
}

//En caso de error al consultar la base de datos
case class AseguradoraNotFoundException(s: String) extends Exception(s)

//Object donde estaran los metodos y atributos de clase
object Aseguradora{
  
    def create(aseguradora: Aseguradora) = {
        val ref  = Conexion.ref(s"aseguradoras/${aseguradora.nit}")
        val aseguradoraRecord = aseguradora.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(aseguradoraRecord, new DatabaseReference.CompletionListener() {
            override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
                if(databaseError != null){
                    print(databaseError)
                }else{
                    print(databaseReference)
                }
            }
        })
    }
    
    //Método para obtener una Aseguradora por su nit (Clave primaria)
  def obtenerPorNit(nit: String): Option[Aseguradora] = {
    val ref = Conexion.ref(s"aseguradoras/$nit")                   //Se establece la conexión
    val aseguradoraRecibida = Promise[Aseguradora]                        //Se "promete" la entrega de un objeto Aseguradora
    ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
      override def onDataChange(snapshot: DataSnapshot) = {
        val aseguradoraBD: AseguradoraBean =snapshot.getValue(classOf[AseguradoraBean])
        if(aseguradoraBD != null){                                    //Comprueba que si haya recibido la Aseguradora en formato plano
          aseguradoraRecibida.success(aseguradoraBD.toCase)               //To Case para parsear el formato plano
        } else{
          aseguradoraRecibida.failure(AseguradoraNotFoundException(s"Aseguradora $nit no encontrada")) //En caso de error
        }
      }
      override def onCancelled(databaseError: DatabaseError)={
        println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
      }
    })
    val aseguradoraFuture = aseguradoraRecibida.future                    //Lo parsea a un Future
    Thread.sleep(1000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val aseguradoraOption :Option[Aseguradora] = {if(aseguradoraFuture.isCompleted){aseguradoraFuture.value.get.toOption}else{None}}
    aseguradoraOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }
}