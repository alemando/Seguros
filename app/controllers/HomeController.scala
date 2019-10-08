package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.{Main,Cliente}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.clientes("Clientes")(request))
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }
}
