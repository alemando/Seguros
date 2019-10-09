// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/GitHub/Seguros/conf/routes
// @DATE:Wed Oct 09 15:53:55 COT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def verClientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.verClientes",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
          }
        
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def guardarBien: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarBien",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bienes/save"})
        }
      """
    )
  
    // @LINE:14
    def verCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.verCategoria",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
        }
      """
    )
  
    // @LINE:12
    def guardarAseguradora: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarAseguradora",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aseguradoras/save"})
        }
      """
    )
  
    // @LINE:9
    def guardarCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarCliente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/save"})
        }
      """
    )
  
    // @LINE:17
    def verBienes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.verBienes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bienes"})
        }
      """
    )
  
    // @LINE:15
    def guardarCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarCategoria",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/save"})
        }
      """
    )
  
  }


}
