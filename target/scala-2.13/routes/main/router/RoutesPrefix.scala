// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/juanm/git/Seguros/conf/routes
// @DATE:Wed Oct 09 14:15:34 COT 2019


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
