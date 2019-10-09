// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/GitHub/Seguros/conf/routes
// @DATE:Wed Oct 09 15:53:55 COT 2019


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
