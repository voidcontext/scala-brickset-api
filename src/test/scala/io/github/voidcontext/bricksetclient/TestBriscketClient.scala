package bricksetapispec

import org.scalatest._

import io.github.voidcontext.bricksetclient.api._
import io.github.voidcontext.bricksetclient.client._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

import scala.util.{Success, Failure}

class BricksetClientSpec extends FlatSpec with Matchers {
  var source = scala.io.Source.fromFile("src/test/resources/api.key")
  val apikey = source.mkString.trim
  source.close

  source = scala.io.Source.fromFile("src/test/resources/credentials.txt")
  val credentials = source.getLines
  val username = credentials.next
  val password = credentials.next
  source.close

  val duration = (60.seconds)

  val client = BricksetClient(apikey)
  var userHash = ""

  it should "check the api key" in {
    
    val future: Future[CheckKeyResponse] = client.checkKey()
    val res: CheckKeyResponse = Await.result(future, duration)

    res.checkKeyResult match {
      case Some(result: String) => result should fullyMatch regex "OK \\(v2(ACM|)\\)"
      case _                    => fail
    }
  }

  it should "not login with invalid credentials" in {
    
    val future: Future[LoginResult] = client.login("dummyUser", "dummyPassword")

    Await.result(future, duration) match {
      case Some(Failure(err)) => err.getMessage shouldBe "ERROR: invalid username and/or password"
      case _                  => fail("Got valid login response or no response")
    }

  }

  it should "login with credentials" in {
    
    val future: Future[LoginResult] = client.login(username, password)

    Await.result(future, duration) match {
      case Some(Success(hash: String)) => userHash = hash
      case Some(Failure(err))  => fail(err.getMessage)
      case None                => fail
    }

    userHash shouldNot startWith regex "(ERROR|INVALIDKEY)"
  }

  it should "query sets" in {
    val future: Future[Option[Seq[Sets]]] = client.getSets(query = Some("6273"))

    Await.result(future, duration) match {
      case Some(sets: Seq[Sets]) => {
        val set: Sets = sets filter { set => set.number.get == "6273"} head
        val setName: String = set.name.get

        setName shouldBe "Rock Island Refuge"
      }
      case None => fail("Empty response")
    }
    
  }

  it should "load owned sets" in {
    val future: Future[Option[Seq[Sets]]] = client.getOwnedSets(userHash)
    Await.result(future, duration) match {
      case Some(sets) => sets.length should be > 1
      case None       => fail()
    }

  }
}
