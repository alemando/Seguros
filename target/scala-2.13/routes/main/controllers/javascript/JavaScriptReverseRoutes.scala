// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Desktop/seguros/conf/routes
// @DATE:Thu Oct 10 00:48:42 COT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def verClientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.verClientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
        }
      """
    )
  
    // @LINE:8
    def verAseguradoras: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.verAseguradoras",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def guardarBien: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarBien",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bienes/save"})
        }
      """
    )
  
    // @LINE:18
    def verCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.verCategoria",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
        }
      """
    )
  
    // @LINE:16
    def guardarAseguradora: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarAseguradora",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aseguradoras/save"})
        }
      """
    )
  
    // @LINE:12
    def guardarCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarCliente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/save"})
        }
      """
    )
  
    // @LINE:22
    def verBienes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.verBienes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bienes"})
        }
      """
    )
  
    // @LINE:20
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
