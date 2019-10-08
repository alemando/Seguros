package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class ClienteController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  
  def principal() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.clientes())
  }
  
  def crearCliente() = Action {request: Request[AnyContent] =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map {args =>
      val nit = args("nit").head
      val nombre = args("nombre").head
      val contacto = args("contacto").head
      Ok(views.html.prueba(nit)(nombre)(contacto))
      
    }.getOrElse(Ok(views.html.aseguradoras()))
  }
}
