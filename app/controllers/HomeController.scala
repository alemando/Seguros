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
  
  val url = System.getProperty("user.dir")
  def index() = {Main
    Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
    
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }
  
  def consola() = {
    val c1 = Cliente("1","Santiago") //Creo los objetos Cliente
    val c2 = Cliente("2","Eladio")
    val c3 = Cliente("3","Ricardo")
    Cliente.create(c1)              //Este método permite crear un cliente en la base de datos
    Cliente.create(c2)
    Cliente.create(c3)
    Action { implicit request: Request[AnyContent] => //Finalmente abre la página
    Ok(views.html.consola("Hola Mundo")(c1)(c2)(c3)(List(c1,c2,c3)))} //Aquí mandamos los parámetros que queramos ver en la vista
  }
  
}
