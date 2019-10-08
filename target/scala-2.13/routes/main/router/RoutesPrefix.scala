// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/conf/routes
// @DATE:Tue Oct 08 14:52:42 COT 2019


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
