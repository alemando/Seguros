case class Cliente(val documento:String,val nombre:String,val apellido1:String,val apellido2:String,var _direccion:String,var _datosResidencia:String,var _datosContacto:String,val fechaNacimiento:String,var _ingresos:Int, var _egresos:Int){
  //Getters
  def direccion=_direccion
  def datosResidencia=_datosResidencia
  def datosContacto=_datosContacto
  def ingresos=_ingresos
  def egresos=_egresos
  
  //Setters
  def setDireccion_=(direccion:String)=_direccion
  def setResidencia_=(datosResidencia:String)=_datosResidencia
  def setDatosContacto_=(datosContacto:String)=_datosContacto
  def setIngresos_=(ingresos:Int)=_ingresos
  def setEgresos_=(egresos:Int)=_egresos
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
