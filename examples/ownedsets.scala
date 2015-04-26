object OwnedSets {
  import scala.concurrent._
  import ExecutionContext.Implicits.global

  val apikey = "apikey"
  val username = "username"
  val password = "password"

  def main(args: Array[String]) {
    import io.github.voidcontext.bricksetclient.api._
    import io.github.voidcontext.bricksetclient.client.BricksetClient

    import scala.util.{Success, Failure}

    val client = new BricksetClient(apikey, None)
    val future = client.login(username, password)

    future flatMap {
      case Right(hash) => client.getOwnedSets(hash)
      case Left(err) => Future { throw err }
    } onComplete {
      case Success(setsOwnedByLoggedInUser) => {
          setsOwnedByLoggedInUser map { s => println(s.getName)}
          client.shutdown
        }
      case Failure(_) => {
          println("Couldn't get owned sets")
          client.shutdown
        }
    }
  }
}


