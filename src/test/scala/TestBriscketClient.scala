package bricksetapispec

import org.scalatest._
import bricksetclient._

import scala.concurrent.Await
import scala.concurrent.duration._
import akka.util.Timeout

class BricksetClientSpec extends FlatSpec with Matchers {
  val source = io.Source.fromFile("src/test/resources/api.key")
  val apikey = source.mkString.trim
  source.close

  val duration = (60 seconds)

  it should "check the api key" in {
    val client = new BricksetClient(apikey)
    
    val future = client.checkKey()
    val result = Await.result(future, duration)

    result should fullyMatch regex "OK \\(v2(ACM|)\\)"
  }
}
