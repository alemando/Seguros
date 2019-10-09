package models

import scala.util.matching.Regex
import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

//class Admin, la cual Hereda de vendedor

class Admin(docId: String, nom: String, ape1: String, apel2: String, numCon: String) extends
Vendedor(docId,nom,ape1,apel2,numCon,true){
  //Este método me regresa un clienteBean, lo que hace es convetir esta clase case, en una plana
  //para poder ser recibida en la base de datos.
    override def toBean = {
        val admin = new AdminBean()
        admin.documentoIdentidad = documentoIdentidad
        admin.nombre = nombre
        admin.apellido1 = apellido1
        admin.apellido2 = apellido2
        admin.numContacto = numContacto
        admin.esAdmin = esAdmin
        admin
    }
}

//En caso de error al consultar la base de datos

case class AdminNotFoundException(s: String) extends Exception(s)


class AdminBean() extends VendedorBean{
        
   //Convierte clase plana a clase case
    override def toCase: Admin = {
        new Admin(documentoIdentidad, nombre, apellido1, apellido2, numContacto)
    }
}
//Clase plana, la base de datos solo recibe clases planas


//Object donde estaran los metodos y atributos de clase

object Admin{
  
    def create(admin: Admin) = {
        val ref  = Conexion.ref(s"vendedores/${admin.documentoIdentidad}")
        val adminRecord = admin.toBean
        //Inserta en la base de datos con setValue
        ref.setValue(adminRecord, new DatabaseReference.CompletionListener() {
            override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
                if(databaseError != null){
                    print(databaseError)
                }else{
                    print(databaseReference)
                }
            }
        })
    }
    
    
    
  //este metodo lo que hace es verificar los datos sean correctos por medio de expresiones regulares
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