
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
    val apiError = new Exception("API error")

    val completedFuture: Future[Unit] =  client.login(username, password) flatMap {
      case Success(hash)   => client.getOwnedSets(hash)
      case Failure(err)    => Future.failed(err)
    } map { sets =>
      sets.foreach { set => println(set.name.get) }
    } recover {
      case err: Exception        => println(err.getMessage)
    }

    Await.ready(completedFuture, 30.seconds)
  }
}


