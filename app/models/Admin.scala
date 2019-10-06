package models

import scala.util.matching.Regex
import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

//Case class de Admin, la cual Hereda de vendedor(seller)

case class Admin(private documentoIdentidad: String,private nombre: String, apellido1: String, apellido2: String, numContacto: String, esAdmin: Boolean) extends
Seller(documentoIdentidad,nombre,apellido1,apellido2,numContacto){
  //Este método me regresa un clienteBean, lo que hace es convetir esta clase case, en una plana
  //para poder ser recibida en la base de datos.
   def toBean = {
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
//este metodo lo que hace es verificar los datos sean correctos por medio de expresiones regulares
def verificacion(documentoIdentidad :String,nombre:String,apellido1:String,apellido2:String,numContacto:String,esAdmin:Boolean): (Boolean,String) = {
    //expresion regular para verificar si todo son numeros
    val numberPattern: Regex = "^[\\d\\s]+$".r
    //expresion regular para verificar si todo son lertas
    val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
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
//Clase plana, la base de datos solo recibe clases planas

class AdminBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var documentoIdentidad: String = null
    @BeanProperty var nombre: String = null
    @BeanProperty var apellido1: String = null
    @BeanProperty var apellido2: String = null
    @BeanProperty var numContacto: String = null
    @BeanProperty var esAdmin: Boolean = null
    
   //Convierte clase plana a clase case
    def toCase: Admin = {
        Admin(documentoIdentidad, nombre, apellido1, apellido2, numContacto,esAdmin)
    }
}

//En caso de error al consultar la base de datos

case class AdminNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Admin{
  
    def create(admin: Admin) = {
        verificacion
        val ref  = Conexion.ref(s"admin/${admin.documentoIdentidad}")
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
}