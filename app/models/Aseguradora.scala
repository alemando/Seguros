package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._


case class Aseguradora(nit: String, nombre: String,contacto:String){
    def toBean = {
        val aseguradora = new AseguradoraBean()
        aseguradora.nit = nit
        aseguradora.nombre = nombre
        aseguradora.contacto = contacto
        aseguradora
    }
}

//Clase plana, la base de datos solo recibe clases planas
class AseguradoraBean(){
    //Autogenera los setter y getter con el Bean Property
    @BeanProperty var nit: String = null
    @BeanProperty var nombre: String = null
    @BeanProperty var contacto: String = null

    //Convierte clase plana a clase case
    def toCase: Aseguradora = {
        Aseguradora(nit, nombre,contacto)
    }
}

//En caso de error al consultar la base de datos
case class AseguradoraNotFoundException(s: String) extends Exception(s)

//Object donde estaran los metodos y atributos de clase
object Aseguradora{
  
    def create(aseguradora: Aseguradora) = {
        val ref  = Conexion.ref(s"aseguradoras/${aseguradora.nit}")
        val aseguradoraRecord = aseguradora.toBean
        
        //Inserta en la base de datos con setValue
        ref.setValue(aseguradoraRecord, new DatabaseReference.CompletionListener() {
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
  def verificacion(nit: String, nombre: String, contacto: String): (Boolean,String) = {
      //expresion regular para verificar si todo son numeros
      val numberPattern: Regex = "^[\\d\\s]+$".r
      //expresion regular para verificar si todo son lertas
      val letterPattern: Regex = "^[a-zA-Z\\s]+$".r
      //expresion regular para verificar si es una fecha, atentos, permite formatos como 31.12.3013 o 01/01/2013 o 05-3-2013 o 15.03.2013
      val datePatter: Regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$".r
      //variables que guardan en su caso el match con la expresion regular
      val matchesnit = numberPattern.findAllIn(nit)
      val matchescontacto = numberPattern.findAllIn(contacto)
      // si el tamaño del match es 0 significa que no encontro match con la expresion regular.
      if (matchesnit.size == 0 || matchescontacto.size == 0){
          return(false,"Esto no es un numero o no es positivo el numero")
      }
      val matchesnombre = letterPattern.findAllIn(nombre)
  
      if (matchesnombre.size == 0){
          return(false,"Esto no es un caracter")
      }
      return(true, "correcto")

  }
    
}