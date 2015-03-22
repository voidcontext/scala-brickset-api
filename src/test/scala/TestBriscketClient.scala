package bricksetapispec

import org.scalatest._
import bricksetclient._

class BricksetClientSpec extends FlatSpec with Matchers {
  it should "set default properties" in {
    var apiKey = "dummy-key"
    val client = new BricksetClient(apiKey)

    client shouldBe a [BricksetClient]
    client.apiKey shouldBe (apiKey)
    client.endPoint shouldBe ("http://brickset.com/webservices/brickset.asmx")
  }
}
