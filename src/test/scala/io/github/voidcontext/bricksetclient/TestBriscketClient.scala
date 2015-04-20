package bricksetapispec

import org.scalatest._

import io.github.voidcontext.bricksetclient.client._
import io.github.voidcontext.bricksetclient.api._


import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import akka.util.Timeout
import akka.actor.ActorSystem

class BricksetClientSpec extends FlatSpec with Matchers with BeforeAndAfterAll {
  var source = scala.io.Source.fromFile("src/test/resources/api.key")
  val apikey = source.mkString.trim
  source.close

  source = scala.io.Source.fromFile("src/test/resources/credentials.txt")
  val credentials = source.getLines
  val username = credentials.next
  val password = credentials.next
  source.close

  val duration = (60 seconds)

  val client = new BricksetClient(apikey, None)
  var userHash = "";

  override def afterAll() {
    client.shutdown()
  }

  it should "check the api key" in {
    
    val future = client.checkKey()
    val result = Await.result(future, duration)

    result should fullyMatch regex "OK \\(v2(ACM|)\\)"
  }

  it should "not login with invalid credentials" in {
    
    val future = client.login("dummyUser", "dummyPassword")

    Await.result(future, duration) match {
      case Left(err) => err.message shouldBe "ERROR: invalid username and/or password"
      case _          => fail("Got valid login response")
    }

  }

  it should "login with credentials" in {
    
    val future = client.login(username, password)
    Await.result(future, duration) match {
      case Left(err) => fail(err.message)
      case Right(hash) => {
        userHash = hash
      }
    }

    userHash shouldNot startWith regex "(ERROR|INVALIDKEY)"
  }

  it should "query sets" in {
    val future: Future[Seq[Sets]] = client.getSets(Map(
        "query" -> "6273"
      ))

    val result = Await.result(future, duration)
    
    val set = result.filter(set => set.getNumber == "6273").head
    set.getName shouldBe "Rock Island Refuge"
  }

  it should "load owned sets" in {
    val future: Future[Seq[Sets]] = client.getOwnedSets(userHash)
    val result = Await.result(future, duration)

    result.length should be > 1
  }

  it should "use the given actor system when available" in {
    val system = ActorSystem("BricksetClientTest")
    val client2 = new BricksetClient(apikey, Some(system));

    val future = client2.checkKey()
    val result = Await.result(future, duration)

    result should fullyMatch regex "OK \\(v2(ACM|)\\)"

    // should do nothing
    client2.shutdown()

    // should shut down the actor system
    system.shutdown()
  }
}
