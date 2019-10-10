// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alema/Documents/GitHub/Seguros/conf/routes
// @DATE:Thu Oct 10 01:24:28 COT 2019


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
