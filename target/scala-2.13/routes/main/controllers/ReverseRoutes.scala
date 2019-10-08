// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 17:35:11 COT 2019
=======
// @SOURCE:D:/INGENIERIA DE SISTEMAS/Ingenieria de Requisitos/Seguros/conf/routes
// @DATE:Tue Oct 08 16:09:31 COT 2019
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

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
    def verClientes(): Call = {
    
      () match {
      
        // @LINE:8
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "clientes")
      
      }
    
=======
    // @LINE:10
    def principal(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clientes")
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
<<<<<<< HEAD
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def guardarBien(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bienes/save")
    }
  
    // @LINE:14
    def verCategoria(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorias")
    }
  
    // @LINE:12
    def guardarAseguradora(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "aseguradoras/save")
    }
  
    // @LINE:9
    def guardarCliente(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clientes/save")
    }
  
    // @LINE:17
    def verBienes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bienes")
    }
  
    // @LINE:15
    def guardarCategoria(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "categorias/save")
=======
    // @LINE:9
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:8
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:11
    def SellerYes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "SellerYes")
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
    }
  
  }


}
