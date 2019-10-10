// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Sebastian/Documents/GitHub/Seguros2/conf/routes
// @DATE:Thu Oct 10 00:18:59 COT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseController Controller = new controllers.ReverseController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseController Controller = new controllers.javascript.ReverseController(RoutesPrefix.byNamePrefix());
  }

}
