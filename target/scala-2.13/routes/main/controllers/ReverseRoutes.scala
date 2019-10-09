// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 19:32:38 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def verClientes(): Call = {
    
      () match {
      
        // @LINE:9
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "clientes")
      
      }
    
    }
  
    // @LINE:8
    def verAseguradoras(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:11
  class ReverseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def guardarBien(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bienes/save")
    }
  
    // @LINE:17
    def verCategoria(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorias")
    }
  
    // @LINE:15
    def guardarAseguradora(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "aseguradoras/save")
    }
  
    // @LINE:11
    def guardarCliente(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clientes/save")
    }
  
    // @LINE:20
    def verBienes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bienes")
    }
  
    // @LINE:18
    def guardarCategoria(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "categorias/save")
    }
  
  }


}
