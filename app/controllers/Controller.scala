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
    {
      val paramVal = request.body.asFormUrlEncoded.map{args =>
        val documento = args("documento").head
        val clientePrueba = Cliente(documento, "prueba", "prueba", "Franco", "Calle 11", "Nose", "Nose", "10/28/1999", 140000,10000)
        Cliente.create(clientePrueba)
      }
      
      Ok("1")
    }
  }
  
  def guardarAseguradora() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }
  
  def verCategoria() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }

  def guardarCategoria() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }

  def verBienes() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }

  def guardarBien() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.aseguradoras())
  }
}
