package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._
import scala.beans.BeanProperty
import com.google.firebase.FirebaseException
import scala.concurrent.Future
import scala.concurrent.Promise

//Case class de venderdor, tendra los metodos de instancia y la inicializacion de los atributos de instancia
//Se corrigienron unos atributos para tener consitencia con la BD

case class Vendedor(documentoIdentidad: String, nombre: String, apellido1: String, apellido2: String, 
numContacto: String,esAdmin: Boolean = false) {
    //Este método me regresa un clienteBean, lo que hace es convetir esta clase case, en una plana
    //para poder ser recibida en la base de datos.
   def toBean = {
        val vendedor = new VendedorBean()
        vendedor.documentoIdentidad = documentoIdentidad
        vendedor.nombre = nombre
        vendedor.apellido1 = apellido1
        vendedor.apellido2 = apellido2
        vendedor.numContacto = numContacto
        vendedor.esAdmin = esAdmin
        vendedor
    }
}


//Clase plana, la base de datos solo recibe clases planas

case class VendedorNotFoundException(s: String) extends Exception(s)
//En caso de error al consultar la base de datos


class VendedorBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var documentoIdentidad: String = null
    @BeanProperty var nombre: String = null
    @BeanProperty var apellido1: String = null
    @BeanProperty var apellido2: String = null
    @BeanProperty var numContacto: String = null
    @BeanProperty var esAdmin: Boolean = false
        
   //Convierte clase plana a clase case
    def toCase: Vendedor = {
        Vendedor(documentoIdentidad, nombre, apellido1, apellido2, numContacto,esAdmin)
    }
}

//Object donde estaran los metodos y atributos de clase

object Vendedor{
  
    def create(vendedor: Vendedor) = {
        val ref  = Conexion.ref(s"vendedores/${vendedor.documentoIdentidad}")
        val vendedorRecord = vendedor.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(vendedorRecord, new DatabaseReference.CompletionListener() {
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
  def obtenerPorCedula(cedula: String): Option[Vendedor] = {
    val ref = Conexion.ref(s"vendedores/$cedula")                   //Se establece la conexión
    val vendedorRecibido = Promise[Vendedor]                        //Se "promete" la entrega de un objeto Vendedor
    ref.addListenerForSingleValueEvent(new ValueEventListener(){  //Empieza el método de la Conexión para extraer un dato
      override def onDataChange(snapshot: DataSnapshot) = {
        val vendedorBD: VendedorBean =snapshot.getValue(classOf[VendedorBean])
        if(vendedorBD != null){                                    //Comprueba que si haya recibido el Vendedor en formato plano
          vendedorRecibido.success(vendedorBD.toCase)              //To Case para parsear el formato plano
          
        } else{
          vendedorRecibido.failure(VendedorNotFoundException(s"Vendedor $cedula no encontrado")) //En caso de error
        }
      }
      override def onCancelled(databaseError: DatabaseError)={
        println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
      }
    })
    val vendedorFuture = vendedorRecibido.future                    //Lo parsea a un Future
    Thread.sleep(10000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val vendedorOption :Option[Vendedor] = {if(vendedorFuture.isCompleted){vendedorFuture.value.get.toOption}else{None}}
    vendedorOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }



    def verificacion(documentoIdentidad :String,nombre:String,apellido1:String,apellido2:String,numContacto:String,esAdmin:Boolean): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
      //variables que guardan en su caso el match con la expresion regular
      val matchesid = numberPattern.findAllIn(documentoIdentidad)
      val matchesnum = numberPattern.findAllIn(numContacto)
      // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
      if (matchesid.size == 0 || matchesnum.size == 0 ){
          return(false,"Esto no es un numero o no es positivo el numero")
      }
      val matchesnombre = letterPattern.findAllIn(nombre)
      val matchesapp1 = letterPattern.findAllIn(apellido1)
      val matchesapp2 = letterPattern.findAllIn(apellido2)
  
      if (matchesnombre.size == 0 || matchesapp1.size == 0 || matchesapp2.size == 0){
          return(false,"Esto no es un caracter")
      }
      if(esAdmin == false){
          return(false,"NO ES UN ADMIN!")
      }
      return(true, "correcto")

  }   
}
