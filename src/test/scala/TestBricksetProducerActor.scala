package bricksetactorspec

import org.scalatest._
import bricksetproduceractor._

import scala.collection.JavaConversions._
import akka.actor.{ActorSystem, Props}

import akka.pattern.ask
import scala.concurrent.Await
import akka.util.Timeout
import scala.concurrent.duration._



class BricksetProducerActorSpec extends FlatSpec with Matchers {
  val sys = ActorSystem("BricksetProducerActorTest")
  val actor = sys.actorOf(Props[BricksetProducerActor], "bricksetproduceractor")

  implicit val timeout = Timeout(60 seconds)

  it should "check the key" in {
    val req = new BricksetRequest(List("dummy key"), Map(
      "operationName" -> "checkKey"
    ))
    
    val future = actor ? req
    
    val result = Await.result(future, timeout.duration).asInstanceOf[String]
    result shouldBe ("INVALIDKEY")
  }
}
