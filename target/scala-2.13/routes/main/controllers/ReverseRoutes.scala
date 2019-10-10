// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/alema/Documents/GitHub/Seguros/conf/routes
// @DATE:Thu Oct 10 01:24:28 COT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def verClientes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "clientes")
    }
  
    // @LINE:8
    def verAseguradoras(): Call = {
    
      () match {
      
        // @LINE:8
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:27
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def guardarBien(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bienes/save")
    }
  
    // @LINE:18
    def verCategoria(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorias")
    }
  
    // @LINE:16
    def guardarAseguradora(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "aseguradoras/save")
    }
  
    // @LINE:12
    def guardarCliente(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "clientes/save")
    }
  
    // @LINE:22
    def verBienes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bienes")
    }
  
    // @LINE:20
    def guardarCategoria(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "categorias/save")
    }
  
  }


}
