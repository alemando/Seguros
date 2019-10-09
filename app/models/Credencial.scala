package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._


case class Credencial(documentoIdentidadVendedor: String, usuario: String,contrasena: String) {
   def toBean = {
        val credencial = new CredencialBean()
        credencial.documentoIdentidadVendedor = documentoIdentidadVendedor
        credencial.usuario = usuario
        credencial.contrasena = contrasena
        credencial
    }
}


//Clase plana, la base de datos solo recibe clases planas

class CredencialBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var documentoIdentidadVendedor: String = null
    @BeanProperty var usuario: String = null
    @BeanProperty var contrasena: String = null
        
   //Convierte clase plana a clase case
    def toCase: Credencial = {
        Credencial(documentoIdentidadVendedor, usuario, contrasena)
    }
}

//En caso de error al consultar la base de datos

case class CredencialNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Credencial{
  
    def create(credencial: Credencial) = {
        val ref  = Conexion.ref(s"credenciales/${credencial.documentoIdentidadVendedor}")
        val credencialRecord = credencial.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(credencialRecord, new DatabaseReference.CompletionListener() {
            override def onComplete(databaseError: DatabaseError, databaseReference: DatabaseReference) = {
                if(databaseError != null){
                    print(databaseError)
                }else{
                    print(databaseReference)
                }
            }
        })
    } 
    
      def verificacion(documentoIdentidadVendedor: String, usuario: String,contrasena: String): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
      //variables que guardan en su caso el match con la expresion regular
      val matchesidvendedor = numberPattern.findAllIn(documentoIdentidadVendedor)

      // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
      if (matchesidvendedor.size == 0 ){
          return(false,"Esto no es un numero o no es positivo el numero")
      }
      val matchesusuario= letterPattern.findAllIn(nombreCategoria)
  
      if (matchesusuario.size == 0 ){
          return(false,"Esto no es un caracter")
      }
      //alexis me dijo que debia ser asi(si no funciona alexis quedo de corregirlo)
      if(contraseña.size < 4){
          return(false, "Tamaño insuficiente en la contraseña")
      }
      return(true, "correcto")

  }

}