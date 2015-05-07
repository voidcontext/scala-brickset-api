package io.github.voidcontext.bricksetclient.client

import io.github.voidcontext.bricksetclient.api._

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

case class InvalidCredentialsError(message: String) extends Exception(message)


class BricksetClient(val apiKey: String, private val system: ActorSystem, val shutdown: () => Unit) {

  // instantiate a BricksetProducerActor actor
  private val actor = system.actorOf(Props[BricksetProducerActor], "bricksetproduceractor")

  // set promise timmeouts
  implicit val timeout = Timeout(60 seconds)

  private def askBricksetActor[T](operationClass: Class[T], params: Map[String, String]): Future[Any] = {
    actor ? BricksetRequestBuilder(apiKey, operationClass, params);
  }

  /**
   * Checks the current api key
   */
  def checkKey(): Future[String] = {
    askBricksetActor(classOf[CheckKey], Map()).mapTo[String]
  }

  /**
   * Get user hash using the given credentials
   */
  def login(username: String, password: String): Future[LoginResult] = {
    val errorRe = "(ERROR:.*|INVALIDKEY)".r

    askBricksetActor(classOf[Login], Map(
        "username" -> username,
        "password" -> password
      )).mapTo[String] map { _ match {
          case errorRe(message) => Left(InvalidCredentialsError(message))
          case userHash         => Right(userHash)
        }
      }
  }

  /**
   * Get sets
   */
  def getSets(params: Map[String, String]) : Future[Seq[Sets]] = {
    askBricksetActor(classOf[GetSets], params)
      .mapTo[Seq[Sets]]
  }

  /**
   * Shortcut for getting the owned sets of the previously logged in user
   */
  def getOwnedSets(userHash: String) : Future[Seq[Sets]] = {
    askBricksetActor(classOf[GetSets], Map(
        "userHash" -> userHash,
        "owned" -> "1"
      ))
      .mapTo[Seq[Sets]]
  }
}

object BricksetClient {
  val internalActorSystemName = "BricksetClient"

  def apply(apikey: String) = {
    val system = ActorSystem(internalActorSystemName)
    new BricksetClient(apikey, system, () => system.shutdown)
  }

  def apply(apikey: String, outerSystem: ActorSystem): BricksetClient = new BricksetClient(apikey, outerSystem, () => Unit)

}


