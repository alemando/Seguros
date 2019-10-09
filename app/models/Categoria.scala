package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

case class Categoria(nombre: String){
    def toBean = {
        val categoria = new CategoriaBean()
        categoria.nombre = nombre
        categoria
    }
}

//Clase plana, la base de datos solo recibe clases planas
class CategoriaBean(){
    //Autogenera los setter y getter con el Bean Property
    @BeanProperty var nombre: String = null
    
    //Convierte clase plana a clase case
    def toCase: Categoria = {
        Categoria(nombre)
    }
}

//En caso de error al consultar la base de datos
case class CategoriaNotFoundException(s: String) extends Exception(s)

//Object donde estaran los metodos y atributos de clase
object Categoria{
    def create(categoria: Categoria) = {
        val ref  = Conexion.ref(s"categorias/${categoria.nombre}")
        val categoriaRecord = categoria.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(categoriaRecord, new DatabaseReference.CompletionListener() {
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
  def verificacion(nombre: String): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r

      val matchesnombre = letterPattern.findAllIn(nombre)
  
      if (matchesnombre.size == 0){
          return(false,"Esto no es un caracter")
      }
      return(true, "correcto")

  }

}