package bricksetclient

import scala.collection.JavaConversions._
import bricksetproduceractor._
import com.brickset.api._

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

import javax.xml.bind.annotation.XmlType

class BricksetClient(val apiKey: String) {
  // create an actor system
  private val sys = ActorSystem("BricksetClient")

  // instantiate a BricksetProducerActor actor
  private val actor = sys.actorOf(Props[BricksetProducerActor], "bricksetproduceractor")

  // user hash
  private var userHash: String = ""

  // set promise timmeouts
  implicit val timeout = Timeout(60 seconds)

  /**
   * Builds a BricksetRequest, and automatically adds the apikey param
   */
  private def buildRequest(operation: String, params: List[String]):  BricksetRequest = {
    new BricksetRequest(params, Map(
        "operationName" -> operation
      ))
  }

  /**
   * Builds the param list by reading the operation class' annotation
   */
  private def buildBody[T](operationClass: Class[T], params: Map[String, String]): List[String] = {
    operationClass.getAnnotation(classOf[XmlType]) // get XmlType annotation
      .propOrder.toList // list of property names
      .map(_ match {
        case name if params.contains(name)  => params.apply(name)   // set the specifici prop from the given map
        case name if name == "apiKey"       => apiKey               // set apiKey
        case _                              => ""                   //  set empty prop e.g. optional props
      })
  }

  /**
   * Checks the current api key
   */
  def checkKey(): Future[String] = {
    (actor ? buildRequest("checkKey", buildBody(classOf[CheckKey], Map()))).mapTo[String]
  }

  /**
   * Get user hash using the given credentials
   */
  def login(username: String, password: String): Future[String] = {
    val future = (actor ? buildRequest("login", buildBody(classOf[Login], Map(
        "username" -> username,
        "password" -> password
      )))).mapTo[String]

    future onSuccess {
      case uh : String => userHash = uh
    }

    future
  }

  /**
   * 
   */
  def getOwnedSets() : Future[Seq[Sets]] = {
    (actor ? buildRequest("getSets", buildBody(classOf[GetSets], Map(
        "userHash" -> userHash,
        "owned" -> "1"
      ))))
      .mapTo[Seq[Sets]]

  }
}


