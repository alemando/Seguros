package models

import scala.beans.BeanProperty
import utils.Conexion
import com.google.firebase.database._

case class Cliente(id: String, nombre: String){
    def toBean = {
        val cliente = new ClienteBean()
        cliente.id = id
        cliente.nombre = nombre
    }
}

class ClienteBean(){
    @BeanProperty var id: String = null
    @BeanProperty var nombre: String = null

    def toCase: Cliente = {
        Cliente(id, nombre)
    }
}

case class ClienteNotFoundException(s: String) extends Exception(s)

object Cliente{
    def create(cliente: Cliente) = {
        val ref  = Conexion.ref(s"clientes/${cliente.id}")
        val clienteRecord = cliente.toBean
        ref.setValue(clienteRecord, new DatabaseReference.CompletionListener() {
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