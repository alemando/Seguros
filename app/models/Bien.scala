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

        //este metodo lo que hace es verificar los datos sean correctos por medio de expresiones regulares
  def verificacion(id: String, documentacionIndentidadCliente: String, nombreCategoria: String, 
  caracteristicas: String, documentos:String = ""): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
      //variables que guardan en su caso el match con la expresion regular
      val matchesid = numberPattern.findAllIn(id)
      val matchesidjefe = numberPattern.findAllIn(documentacionIndentidadCliente)

      // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
      if (matchesid.size == 0 || matchesidjefe.size == 0){
          return(false,"Esto no es un numero o no es positivo el numero")
      }
      val matchesnombrecat = letterPattern.findAllIn(nombreCategoria)
      val matchescaract = letterPattern.findAllIn(caracteristicas)
      val matchesdocu = letterPattern.findAllIn(documentos)
  
      if (matchesnombrecat.size == 0 || matchesdocu.size == 0 || matchescaract.size == 0){
          return(false,"Esto no es un caracter")
      }
      return(true, "correcto")

  }

}