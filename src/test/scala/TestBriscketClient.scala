package bricksetapispec

import org.scalatest._

import io.github.voidcontext.bricksetclient.client.BricksetClient
import io.github.voidcontext.bricksetclient.api._


import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import akka.util.Timeout

class BricksetClientSpec extends FlatSpec with Matchers {
  var source = scala.io.Source.fromFile("src/test/resources/api.key")
  val apikey = source.mkString.trim
  source.close

  source = scala.io.Source.fromFile("src/test/resources/credentials.txt")
  val credentials = source.getLines
  val username = credentials.next
  val password = credentials.next
  source.close

  val duration = (60 seconds)

  val client = new BricksetClient(apikey)

  it should "check the api key" in {
    
    val future = client.checkKey()
    val result = Await.result(future, duration)

    result should fullyMatch regex "OK \\(v2(ACM|)\\)"
  }

  it should "login with credentials" in {
    
    val future = client.login(username, password)
    val result = Await.result(future, duration)

    result shouldNot startWith regex "(Error:|INVALIDKEY).*"
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
    val future: Future[Seq[Sets]] = client.getOwnedSets()
    val result = Await.result(future, duration)

    result.length should be > 1
  }
}
