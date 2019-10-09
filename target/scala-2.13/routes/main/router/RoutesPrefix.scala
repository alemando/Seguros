// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Wed Oct 09 15:39:31 COT 2019


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
