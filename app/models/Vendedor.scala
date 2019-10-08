package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

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
}