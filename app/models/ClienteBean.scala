import scala.beans.BeanProperty
class ClienteBean(){
    @BeanProperty var documento:String=null
    @BeanProperty var nombre:String=null
    @BeanProperty var appelido1:String=null
    @BeanProperty var apellido2:String=null
    @BeanProperty var pdireccion:String=null
    @BeanProperty var pdatosResidencia:String=null
    @BeanProperty var pdatosContacto:String=null
    @BeanProperty var fechaNacimiento:String=null
    @BeanProperty var pingresos:String=null
    @BeanProperty var pegresos:String=null

    def toCase:Cliente={
        new Cliente(documento,nombre,appelido1,apellido2,pdireccion,pdatosResidencia,pdatosContacto,fechaNacimiento,pingresos.toInt,pegresos.toInt)
    }
}