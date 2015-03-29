package bricksetclient

import bricksetproduceractor._
import scala.collection.JavaConversions._

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Future
import scala.concurrent.duration._

class BricksetClient(val apiKey: String) {
  // create an actor system
  private val sys = ActorSystem("BricksetClient")

  // instantiate a BricksetProducerActor actor
  private val actor = sys.actorOf(Props[BricksetProducerActor], "bricksetproduceractor")

  // set promise timmeouts
  implicit val timeout = Timeout(60 seconds)

  /**
   * Builds a BricksetRequest, and automatically adds the apikey param
   */
  private def buildRequest(operation: String, params: List[String]):  BricksetRequest = {
    new BricksetRequest(apiKey :: params, Map(
        "operationName" -> operation
      ))
  }

  /**
   * Checks the current api key
   */
  def checkKey(): Future[String] = {
    (actor ? buildRequest("checkKey", List())).mapTo[String]
  }
}


