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
}