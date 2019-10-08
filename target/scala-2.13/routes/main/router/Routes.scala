// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Usuario/Desktop/seguros/conf/routes
// @DATE:Tue Oct 08 17:35:11 COT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_3: controllers.HomeController,
  // @LINE:8
  AsyncController_0: controllers.AsyncController,
  // @LINE:9
  Controller_2: controllers.Controller,
  // @LINE:21
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_3: controllers.HomeController,
    // @LINE:8
    AsyncController_0: controllers.AsyncController,
    // @LINE:9
    Controller_2: controllers.Controller,
    // @LINE:21
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, AsyncController_0, Controller_2, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, AsyncController_0, Controller_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes""", """controllers.AsyncController.verClientes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/save""", """controllers.Controller.guardarCliente"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aseguradoras""", """controllers.AsyncController.verClientes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aseguradoras/save""", """controllers.Controller.guardarAseguradora"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorias""", """controllers.Controller.verCategoria"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorias/save""", """controllers.Controller.guardarCategoria"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bienes""", """controllers.Controller.verBienes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bienes/save""", """controllers.Controller.guardarBien"""),
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
    HomeController_3.index,
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
      """""",
      Seq()
    )
  )

  // @LINE:9
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
      """""",
      Seq()
    )
  )

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
      """""",
      Seq()
    )
  )

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
      """""",
      Seq()
    )
  )

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
      }
  }
}
