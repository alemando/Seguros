package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

//Case class de venderdor, tendra los metodos de instancia y la inicializacion de los atributos de instancia

case class Seller(documentoIdentidad: String, nombre: String, apellido1: String, apellido2: String,
                  numContacto: String, credenciales: Credencial,esAdmin: Boolean = false) {
   def toBean = {
        val seller = new SellerBean()
        seller.documentoIdentidad = documentoIdentidad
        seller.nombre = nombre
        seller.apellido1 = apellido1
        seller.apellido2 = apellido2
        seller.numContacto = numContacto
        seller.esAdmin = esAdmin
        seller.credencial = credenciales
        seller
    }
}


//Clase plana, la base de datos solo recibe clases planas

class SellerBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var documentoIdentidad: String = null
    @BeanProperty var nombre: String = null
    @BeanProperty var apellido1: String = null
    @BeanProperty var apellido2: String = null
    @BeanProperty var numContacto: String = null
    @BeanProperty var esAdmin: Boolean = false
    @BeanProperty var credencial: models.Credencial = null//Falta definir bn esto
        
   //Convierte clase plana a clase case
    def toCase: Seller = {
        Seller(documentoIdentidad, nombre, apellido1, apellido2, numContacto, credencial,esAdmin)
    }
}

//En caso de error al consultar la base de datos

case class SellerNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Seller{
  
    def create(seller: Seller) = {
        val ref  = Conexion.ref(s"vendedores/${seller.documentoIdentidad}")
        val sellerRecord = seller.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(sellerRecord, new DatabaseReference.CompletionListener() {
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