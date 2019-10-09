// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Wed Oct 09 15:39:31 COT 2019
=======
// @SOURCE:C:/Users/juanm/Documents/documentosImportantes/semestre 6/Requisitos/Seguros/conf/routes
// @DATE:Wed Oct 09 00:37:00 COT 2019
>>>>>>> 2c6dcd706cc061fcd3e7b45a3cd8c3c3f9645140

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
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
  
    // @LINE:8
    def verAseguradoras: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.verAseguradoras",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def guardarBien: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarBien",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bienes/save"})
        }
      """
    )
  
    // @LINE:17
    def verCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.verCategoria",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias"})
        }
      """
    )
  
    // @LINE:15
    def guardarAseguradora: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarAseguradora",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aseguradoras/save"})
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:11
    def guardarCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarCliente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/save"})
        }
      """
    )
  
    // @LINE:21
    def verBienes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.verBienes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bienes"})
        }
      """
    )
  
    // @LINE:19
    def guardarCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarCategoria",
=======
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
>>>>>>> 2c6dcd706cc061fcd3e7b45a3cd8c3c3f9645140
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categorias/save"})
        }
      """
    )
  
  }


}
