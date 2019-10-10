package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise
import scala.collection.mutable.ArrayBuffer

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
    Thread.sleep(10000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val aseguradoraOption :Option[Aseguradora] = {if(aseguradoraFuture.isCompleted){aseguradoraFuture.value.get.toOption}else{None}}
    aseguradoraOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }

  //Método para obtener una lista de aseguradoras
  //El funcionamiento de este método es similar al método que obtiene un aseguradora de manera individual pero usa el método
  //orderByChild para obtener un listado
  def obtenerAseguradoras(propiedad: String = "nit"):Option[ArrayBuffer[Aseguradora]]={
    val promesa:Promise[ArrayBuffer[Aseguradora]]= Promise[ArrayBuffer[Aseguradora]]
    val ref = Conexion.ref("aseguradoras")
    ref.orderByChild(propiedad).addListenerForSingleValueEvent(new ValueEventListener(){
      override def onDataChange(snapshot: DataSnapshot) = {
        val listaAseguradoras: ArrayBuffer[Aseguradora] = ArrayBuffer()
        snapshot.getChildren.forEach(listaAseguradoras += _.getValue(classOf[AseguradoraBean]).toCase) //Se usa un foreach para iterar en cada elemento traído y luego se guarda en un ArrayBuffer
        promesa.success(listaAseguradoras)
      }
      override def onCancelled(databaseError: DatabaseError) = {
        println(databaseError.getMessage)
      }
    })
    val future: Future[ArrayBuffer[Aseguradora]]=promesa.future
    Thread.sleep(3000)
    val option: Option[ArrayBuffer[Aseguradora]] = {if(future.isCompleted){future.value.get.toOption}else{None}}
    option
  }

    //este metodo lo que hace es verificar los datos sean correctos por medio de expresiones regulares
  def verificacion(nit: String, nombre: String, contacto: String): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
      //variables que guardan en su caso el match con la expresion regular
      val matchesnit = numberPattern.findAllIn(nit)
      val matchescontacto = numberPattern.findAllIn(contacto)
      // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
      if (matchesnit.size == 0 || matchescontacto.size == 0){
          return(false,"Esto no es un numero o no es positivo el numero")
      }
      val matchesnombre = letterPattern.findAllIn(nombre)
  
      if (matchesnombre.size == 0){
          return(false,"Esto no es un caracter")
      }
      return(true, "correcto")

  }
    
}