// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 22:19:37 COT 2019


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
