package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models._
import scala.collection.mutable.ArrayBuffer

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
      val urlValues = request.body.asFormUrlEncoded.map{args =>
        val documento = args("documento").head
        val nombre = args("nombre").head
        val apellido1 = args("apellido1").head
        val apellido2 = args("apellido2").head
        val direccion = args("direccion").head
        val telefono = args("telefono").head
        val fechaNacimiento = args("fechaNacimiento").head
        val ingresos = args("ingresos").head
        val egresos = args("egresos").head
        val clientePrueba = Cliente(documento, nombre, apellido1, apellido2, direccion, telefono, fechaNacimiento, ingresos, egresos)
        Cliente.create(clientePrueba)
      }
      
      Ok("1")
    }
  }
  val aseguradoras: ArrayBuffer[Aseguradora] = null
  def guardarAseguradora() = Action { implicit request: Request[AnyContent] =>
    val urlValues = request.body.asFormUrlEncoded.map{args =>
      val nit = args("nit").head
      val nombre = args("nombre").head
      val contacto = args("contacto").head
      val aseguradoraPrueba = Aseguradora(nit, nombre, contacto)
      Aseguradora.create(aseguradoraPrueba)
    }
    Ok("1")
  }
  
  def verCategoria() = Action { implicit request: Request[AnyContent] =>
    Ok("1")
  }

  def guardarCategoria() = Action { implicit request: Request[AnyContent] =>
    Ok("1")
  }

  def verBienes() = Action { implicit request: Request[AnyContent] =>
    Ok("1")
  }

  def guardarBien() = Action { implicit request: Request[AnyContent] =>
    Ok("1")
  }
}
