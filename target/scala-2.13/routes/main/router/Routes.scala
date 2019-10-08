// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 17:35:11 COT 2019
=======
// @SOURCE:D:/INGENIERIA DE SISTEMAS/Ingenieria de Requisitos/Seguros/conf/routes
// @DATE:Tue Oct 08 16:09:31 COT 2019
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
<<<<<<< HEAD
  HomeController_3: controllers.HomeController,
  // @LINE:8
  AsyncController_0: controllers.AsyncController,
  // @LINE:9
  Controller_2: controllers.Controller,
  // @LINE:21
=======
  HomeController_2: controllers.HomeController,
  // @LINE:10
  ClienteController_0: controllers.ClienteController,
  // @LINE:15
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
<<<<<<< HEAD
    HomeController_3: controllers.HomeController,
    // @LINE:8
    AsyncController_0: controllers.AsyncController,
    // @LINE:9
    Controller_2: controllers.Controller,
    // @LINE:21
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, AsyncController_0, Controller_2, Assets_1, "/")
=======
    HomeController_2: controllers.HomeController,
    // @LINE:10
    ClienteController_0: controllers.ClienteController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, ClienteController_0, Assets_1, "/")
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
<<<<<<< HEAD
    new Routes(errorHandler, HomeController_3, AsyncController_0, Controller_2, Assets_1, prefix)
=======
    new Routes(errorHandler, HomeController_2, ClienteController_0, Assets_1, prefix)
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
<<<<<<< HEAD
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes""", """controllers.AsyncController.verClientes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/save""", """controllers.Controller.guardarCliente"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aseguradoras""", """controllers.AsyncController.verClientes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aseguradoras/save""", """controllers.Controller.guardarAseguradora"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorias""", """controllers.Controller.verCategoria"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorias/save""", """controllers.Controller.guardarCategoria"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bienes""", """controllers.Controller.verBienes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bienes/save""", """controllers.Controller.guardarBien"""),
=======
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes""", """controllers.ClienteController.principal"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """SellerYes""", """controllers.HomeController.SellerYes"""),
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
<<<<<<< HEAD
    HomeController_3.index,
=======
    HomeController_2.index,
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
<<<<<<< HEAD
  private[this] lazy val controllers_AsyncController_verClientes1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes")))
  )
  private[this] lazy val controllers_AsyncController_verClientes1_invoker = createInvoker(
    AsyncController_0.verClientes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "verClientes",
      Nil,
      "GET",
      this.prefix + """clientes""",
=======
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
      """""",
      Seq()
    )
  )

  // @LINE:9
<<<<<<< HEAD
  private[this] lazy val controllers_Controller_guardarCliente2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes/save")))
  )
  private[this] lazy val controllers_Controller_guardarCliente2_invoker = createInvoker(
    Controller_2.guardarCliente,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Controller",
      "guardarCliente",
      Nil,
      "POST",
      this.prefix + """clientes/save""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AsyncController_verClientes3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aseguradoras")))
  )
  private[this] lazy val controllers_AsyncController_verClientes3_invoker = createInvoker(
    AsyncController_0.verClientes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "verClientes",
      Nil,
      "GET",
      this.prefix + """aseguradoras""",
=======
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:12
  private[this] lazy val controllers_Controller_guardarAseguradora4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aseguradoras/save")))
  )
  private[this] lazy val controllers_Controller_guardarAseguradora4_invoker = createInvoker(
    Controller_2.guardarAseguradora,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Controller",
      "guardarAseguradora",
      Nil,
      "POST",
      this.prefix + """aseguradoras/save""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Controller_verCategoria5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categorias")))
  )
  private[this] lazy val controllers_Controller_verCategoria5_invoker = createInvoker(
    Controller_2.verCategoria,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Controller",
      "verCategoria",
      Nil,
      "GET",
      this.prefix + """categorias""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Controller_guardarCategoria6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categorias/save")))
  )
  private[this] lazy val controllers_Controller_guardarCategoria6_invoker = createInvoker(
    Controller_2.guardarCategoria,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Controller",
      "guardarCategoria",
      Nil,
      "POST",
      this.prefix + """categorias/save""",
=======
  // @LINE:10
  private[this] lazy val controllers_ClienteController_principal3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes")))
  )
  private[this] lazy val controllers_ClienteController_principal3_invoker = createInvoker(
    ClienteController_0.principal,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClienteController",
      "principal",
      Nil,
      "GET",
      this.prefix + """clientes""",
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:17
  private[this] lazy val controllers_Controller_verBienes7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bienes")))
  )
  private[this] lazy val controllers_Controller_verBienes7_invoker = createInvoker(
    Controller_2.verBienes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Controller",
      "verBienes",
      Nil,
      "GET",
      this.prefix + """bienes""",
=======
  // @LINE:11
  private[this] lazy val controllers_HomeController_SellerYes4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("SellerYes")))
  )
  private[this] lazy val controllers_HomeController_SellerYes4_invoker = createInvoker(
    HomeController_2.SellerYes,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "SellerYes",
      Nil,
      "GET",
      this.prefix + """SellerYes""",
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:18
  private[this] lazy val controllers_Controller_guardarBien8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bienes/save")))
  )
  private[this] lazy val controllers_Controller_guardarBien8_invoker = createInvoker(
    Controller_2.guardarBien,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Controller",
      "guardarBien",
      Nil,
      "POST",
      this.prefix + """bienes/save""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
=======
  // @LINE:15
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
<<<<<<< HEAD
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_AsyncController_verClientes1_route(params@_) =>
      call { 
        controllers_AsyncController_verClientes1_invoker.call(AsyncController_0.verClientes)
      }
  
    // @LINE:9
    case controllers_Controller_guardarCliente2_route(params@_) =>
      call { 
        controllers_Controller_guardarCliente2_invoker.call(Controller_2.guardarCliente)
      }
  
    // @LINE:11
    case controllers_AsyncController_verClientes3_route(params@_) =>
      call { 
        controllers_AsyncController_verClientes3_invoker.call(AsyncController_0.verClientes)
      }
  
    // @LINE:12
    case controllers_Controller_guardarAseguradora4_route(params@_) =>
      call { 
        controllers_Controller_guardarAseguradora4_invoker.call(Controller_2.guardarAseguradora)
      }
  
    // @LINE:14
    case controllers_Controller_verCategoria5_route(params@_) =>
      call { 
        controllers_Controller_verCategoria5_invoker.call(Controller_2.verCategoria)
      }
  
    // @LINE:15
    case controllers_Controller_guardarCategoria6_route(params@_) =>
      call { 
        controllers_Controller_guardarCategoria6_invoker.call(Controller_2.guardarCategoria)
      }
  
    // @LINE:17
    case controllers_Controller_verBienes7_route(params@_) =>
      call { 
        controllers_Controller_verBienes7_invoker.call(Controller_2.verBienes)
      }
  
    // @LINE:18
    case controllers_Controller_guardarBien8_route(params@_) =>
      call { 
        controllers_Controller_guardarBien8_invoker.call(Controller_2.guardarBien)
      }
  
    // @LINE:21
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
=======
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_2.explore)
      }
  
    // @LINE:9
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_2.tutorial)
      }
  
    // @LINE:10
    case controllers_ClienteController_principal3_route(params@_) =>
      call { 
        controllers_ClienteController_principal3_invoker.call(ClienteController_0.principal)
      }
  
    // @LINE:11
    case controllers_HomeController_SellerYes4_route(params@_) =>
      call { 
        controllers_HomeController_SellerYes4_invoker.call(HomeController_2.SellerYes)
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
>>>>>>> 6178ee8a346d160e0e5a44173b80f3231da7421f
      }
  }
}
