// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/user/Documents/GitHub/Seguros/conf/routes
// @DATE:Wed Oct 09 15:53:55 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def verClientes(): Call = {
    
      () match {
      
        // @LINE:8
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "clientes")
      
      }
    
    }
  
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
    }
  
  }


}
