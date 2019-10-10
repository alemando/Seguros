// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Desktop/seguros/conf/routes
// @DATE:Thu Oct 10 00:48:42 COT 2019


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
