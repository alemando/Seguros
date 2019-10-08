// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 17:35:11 COT 2019
=======
// @SOURCE:D:/INGENIERIA DE SISTEMAS/Ingenieria de Requisitos/Seguros/conf/routes
// @DATE:Tue Oct 08 16:09:31 COT 2019
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

<<<<<<< HEAD
  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {
=======
  // @LINE:10
  class ReverseClienteController(_prefix: => String) {
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
<<<<<<< HEAD
    // @LINE:8
    def verClientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.verClientes",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
          }
        
=======
    // @LINE:10
    def principal: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClienteController.principal",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
<<<<<<< HEAD
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
=======
    // @LINE:9
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:12
    def guardarAseguradora: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarAseguradora",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "aseguradoras/save"})
=======
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
        }
      """
    )
  
<<<<<<< HEAD
    // @LINE:9
    def guardarCliente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Controller.guardarCliente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/save"})
=======
    // @LINE:11
    def SellerYes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.SellerYes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "SellerYes"})
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
        }
      """
    )
  
<<<<<<< HEAD
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
=======
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
        }
      """
    )
  
  }


}
