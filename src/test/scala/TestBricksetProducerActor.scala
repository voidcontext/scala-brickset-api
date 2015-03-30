package bricksetactorspec

import org.scalatest._
import io.github.voidcontext.bricksetclient.client.{BricksetProducerActor, BricksetRequest}

import scala.collection.JavaConversions._
import akka.actor.{ActorSystem, Props}

import akka.testkit.{TestKit, ImplicitSender}



class BricksetProducerActorSpec extends TestKit(ActorSystem("BricksetProducerActorTest")) 
  with ImplicitSender
  with Matchers
  with FlatSpecLike
  with BeforeAndAfter {

  after {
    system.shutdown()
  }

  val actor = system.actorOf(Props[BricksetProducerActor], "bricksetproduceractor")

  it should "check the key" in {
    val req = new BricksetRequest(List("dummy key"), Map(
      "operationName" -> "checkKey"
    ))
    
    actor ! req

    expectMsg("INVALIDKEY")
    
  }
}
