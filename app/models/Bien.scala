package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._


case class Bien(id: String, documentacionIndentidadCliente: String, nombreCategoria: String, 
caracteristicas: String, documentos:String = "") {
   def toBean = {
        val bien = new BienBean()
        bien.id = id
        bien.documentacionIndentidadCliente = documentacionIndentidadCliente
        bien.nombreCategoria = nombreCategoria
        bien.caracteristicas = caracteristicas
        bien.documentos = documentos
        bien
    }
}


//Clase plana, la base de datos solo recibe clases planas

class BienBean(){
    
  //Autogenera los setter y getter con el Bean Property
    @BeanProperty var id: String = null
    @BeanProperty var documentacionIndentidadCliente: String = null
    @BeanProperty var nombreCategoria: String = null
    @BeanProperty var caracteristicas: String = null
    @BeanProperty var documentos: String = null
        
   //Convierte clase plana a clase case
    def toCase: Bien = {
        Bien(id,documentacionIndentidadCliente,nombreCategoria,caracteristicas,documentos)
    }
}

//En caso de error al consultar la base de datos

case class BienNotFoundException(s: String) extends Exception(s)


//Object donde estaran los metodos y atributos de clase

object Bien{
  
    def create(bien: Bien) = {
        val ref  = Conexion.ref(s"bienes/${bien.id}")
        val bienesRecord = bien.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(bienesRecord, new DatabaseReference.CompletionListener() {
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