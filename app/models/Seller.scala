package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

//Case class de venderdor, tendra los metodos de instancia y la inicializacion de los atributos de instancia

case class Seller(id: String, name: String, last_name1: String, last_name2: String,
                  number_contact: String) {
   def toBean = {
        val seller = new SellerBean()
        seller.id = id
        seller.name = name
        seller.last_name1 = last_name1
        seller.last_name2 = last_name2
        seller.number_contact = number_contact
        seller
    }
}


//Clase plana, la base de datos solo recibe clases planas

class SellerBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var id: String = null
    @BeanProperty var name: String = null
    @BeanProperty var last_name1: String = null
    @BeanProperty var last_name2: String = null
    @BeanProperty var number_contact: String = null
    
   //Convierte clase plana a clase case
    def toCase: Seller = {
        Seller(id, name, last_name1, last_name2, number_contact)
    }
}

//En caso de error al consultar la base de datos

case class SellerNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Seller{
  
    def create(seller: Seller) = {
        val ref  = Conexion.ref(s"seller/${seller.id}")
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