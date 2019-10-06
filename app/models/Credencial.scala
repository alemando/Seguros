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
}