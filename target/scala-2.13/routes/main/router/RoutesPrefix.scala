// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MSI-PC/git/Seguros/conf/routes
// @DATE:Wed Oct 09 11:16:07 GMT-05:00 2019


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
