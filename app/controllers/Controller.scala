package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class Controller @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def guardarCliente() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  
  def guardarAseguradora() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def verCategoria() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def guardarCategoria() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  def verBienes() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def guardarBien() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
