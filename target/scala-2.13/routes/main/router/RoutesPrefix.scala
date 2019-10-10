// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sebastian/Documents/GitHub/Seguros2/conf/routes
// @DATE:Thu Oct 10 00:18:59 COT 2019


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
