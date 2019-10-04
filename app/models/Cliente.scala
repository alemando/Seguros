case class Cliente(val documento:String,val nombre:String,val apellido1:String,val apellido2:String,var pdireccion:String,var pdatosResidencia:String,var pdatosContacto:String,val fechaNacimiento:String,var pingresos:Int, var pegresos:Int){
  //Getters
  //Estas variables decidí empezarlas con p para decir que son privadas, pues BeanProperty me ponia problema si usaba _
  def direccion=pdireccion
  def datosResidencia=pdatosResidencia
  def datosContacto=pdatosContacto
  def ingresos=pingresos
  def egresos=pegresos
  
  //Setters
  def setDireccion_=(direccion:String)=pdireccion
  def setResidencia_=(datosResidencia:String)=pdatosResidencia
  def setDatosContacto_=(datosContacto:String)=pdatosContacto
  def setIngresos_=(ingresos:Int)=pingresos
  def setEgresos_=(egresos:Int)=pegresos
  
  def toBean={
    val cliente= new ClienteBean()
    cliente.documento=documento
    cliente.nombre=nombre
    cliente.appelido1=apellido1
    cliente.apellido2=apellido2
    cliente.pdireccion=pdireccion
    cliente.pdatosResidencia=pdatosResidencia
    cliente.pdatosContacto=pdatosContacto
    cliente.fechaNacimiento=fechaNacimiento
    cliente.pingresos=pingresos.toString()
    cliente.pegresos=pegresos.toString()
    cliente
  }
}

object Cliente{
  def apply(documento:String,nombre:String,apellido1:String,apellido2:String,direccion:String,datosResidencia:String,datosContacto:String,fechaNacimiento:String,ingresos:Int,egresos:Int):Boolean={
    //Cliente(documento,nombre,direccion,datosResidencia,datosContacto,fechaNacimiento,ingresos,egresos)
    if(ingresos<0){
      false
    }
    else{
      var client=Cliente(documento,nombre,apellido1,apellido2,direccion,datosResidencia,datosContacto,fechaNacimiento,ingresos,egresos)
      true
    }
  }
}
