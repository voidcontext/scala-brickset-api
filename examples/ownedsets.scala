
import io.github.voidcontext.bricksetclient.api._
import io.github.voidcontext.bricksetclient.client.BricksetClient

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.util.{Success, Failure}

object OwnedSets {
  val apikey = "apikey"
  val username = "username"
  val password = "password"

  def main(args: Array[String]) {

    val client = BricksetClient(apikey)
    val loginFuture = client.login(username, password)
    val apiError = new Exception("API error")

    val completedFuture: Future[Unit] = loginFuture flatMap {
      case Some(Success(hash))   => client.getOwnedSets(hash)
      case Some(Failure(err))    => Future.failed(err)
      case None                  => Future.failed(apiError)
    } map {
      case Some(sets: Seq[Sets]) => sets.foreach { set => println(set.name.get) }
      case None                  => println(apiError.getMessage)
    } recover {
      case err: Exception        => println(err.getMessage)
    }

    Await.ready(completedFuture, 30.seconds)
  }
}


