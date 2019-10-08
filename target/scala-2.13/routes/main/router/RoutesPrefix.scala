// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 17:35:11 COT 2019
=======
// @SOURCE:D:/INGENIERIA DE SISTEMAS/Ingenieria de Requisitos/Seguros/conf/routes
// @DATE:Tue Oct 08 16:09:31 COT 2019
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
