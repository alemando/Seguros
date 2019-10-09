package controllers

import javax.inject._

import akka.actor.ActorSystem
import play.api.mvc._

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future, Promise}
import scala.collection.mutable.ArrayBuffer
import models.Cliente


@Singleton
class AsyncController @Inject()(cc: ControllerComponents, actorSystem: ActorSystem)(implicit exec: ExecutionContext) extends AbstractController(cc) {

  def verClientes = Action.async {implicit request: Request[AnyContent] =>
    getFutureClientes(10.second).map { msg => Ok(views.html.clientes("Clientes")(msg)(request))}
  }
  
  def verAseguradoras = Action.async {implicit request: Request[AnyContent] =>
    getFutureMessage(3.second).map { msg => Ok(views.html.aseguradoras("Aseguradoras")(msg)(request))}
  }
  
  private def getFutureMessage(delayTime: FiniteDuration): Future[String] = {
    val promise: Promise[String] = Promise[String]()
    actorSystem.scheduler.scheduleOnce(delayTime) {
      promise.success("Hi!")
    }(actorSystem.dispatcher) // run scheduled tasks using the actor system's dispatcher
    promise.future
  }
  
  private def getFutureClientes(delayTime: FiniteDuration): Future[ArrayBuffer[Cliente]] = {
    val promise: Promise[ArrayBuffer[Cliente]] = Promise[ArrayBuffer[Cliente]]()
    actorSystem.scheduler.scheduleOnce(delayTime) {
      val Clientes :ArrayBuffer[Cliente]= Cliente.obtenerClientes().getOrElse(ArrayBuffer()) 
      promise.success(Clientes)
    }(actorSystem.dispatcher) // run scheduled tasks using the actor system's dispatcher
    promise.future
  }

}