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
          vendedorRecibido.success(vendedorBD.toCase)               //To Case para parsear el formato plano
        } else{
          vendedorRecibido.failure(VendedorNotFoundException(s"Vendedor $cedula no encontrado")) //En caso de error
        }
      }
      override def onCancelled(databaseError: DatabaseError)={
        println(databaseError.getMessage)                         //En caso de cancelación de la búsqueda
      }
    })
    val vendedorFuture = vendedorRecibido.future                    //Lo parsea a un Future
    Thread.sleep(1000)                                            //Tiempo de espera para la respuesta de sus exámenes
    val vendedorOption :Option[Vendedor] = {if(vendedorFuture.isCompleted){vendedorFuture.value.get.toOption}else{None}}
    vendedorOption                                                 //Se parsea a option y se devuleve lo que se entrega
  }
}
