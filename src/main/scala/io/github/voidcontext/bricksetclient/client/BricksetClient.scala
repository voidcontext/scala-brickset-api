package io.github.voidcontext.bricksetclient.client

import io.github.voidcontext.bricksetclient.api._

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

case class InvalidCredentialsError(message: String)


class BricksetClient(val apiKey: String) {
  type LoginResult = Either[InvalidCredentialsError, String]

  // create an actor system
  private val sys = ActorSystem("BricksetClient")

  // instantiate a BricksetProducerActor actor
  private val actor = sys.actorOf(Props[BricksetProducerActor], "bricksetproduceractor")

  // set promise timmeouts
  implicit val timeout = Timeout(60 seconds)

  private def askBricksetActor[T](operationClass: Class[T], params: Map[String, String]): Future[Any] = {
    actor ? BricksetRequestBuilder.build(apiKey, operationClass, params);
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


