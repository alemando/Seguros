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
}