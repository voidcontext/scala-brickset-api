package io.github.voidcontext.bricksetclient.client

import io.github.voidcontext.bricksetclient.api._
import scala.concurrent.Future
import scala.util.{Failure, Success}

case class InvalidCredentialsError(message: String) extends Exception(message)

class BricksetClient(val apiKey: String) {
  /**
   * Soap client
   */
  val service = (new BricksetAPIv2Soap12Bindings
      with scalaxb.SoapClientsAsync
      with scalaxb.DispatchHttpClientsAsync {}
    ).service

  /**
   * Checks the current api key
   */
  def checkKey(): Future[CheckKeyResponse] = {
    service.checkKey(Some(apiKey))
  }

  /**
   * Get user hash using the given credentials
   */
  def login(username: String, password: String): Future[LoginResult] = {
    val errorRe = "(ERROR:.*|INVALIDKEY)".r

    service.login(Some(apiKey), Some(username), Some(password)) map { response: LoginResponse =>
      for {
        result <- response.loginResult
      } yield result match {
        case errorRe(response) => Failure(InvalidCredentialsError(response))
        case userHash          => Success(userHash)
      }
    }
  }

  def getSets(userHash: Option[String] = Some(""), query: Option[String] = Some(""), theme: Option[String] = Some(""),
              subtheme: Option[String] = Some(""), setNumber: Option[String] = Some(""), year: Option[String] = Some(""),
              owned: Option[String] = Some(""), wanted: Option[String] = Some(""), orderBy: Option[String] = Some(""),
              pageSize: Option[String] = Some(""), pageNumber: Option[String] = Some(""), userName: Option[String] = Some("")
               ): Future[Option[Seq[Sets]]] = {

    service.getSets(Some(apiKey), userHash, query, theme, subtheme, setNumber, year, owned, wanted, orderBy, pageSize,
      pageNumber, userName) map { res =>
        for {
          aos <- res.getSetsResult
        } yield aos.sets.flatten
      }
  }

  /**
   * Shortcut for getting the owned sets of the previously logged in user
   */
  def getOwnedSets(userHash: String) : Future[Option[Seq[Sets]]] = {
    getSets(Some(userHash), owned = Some("1"))
  }
}

object BricksetClient {
  def apply(apikey: String) = {
    new BricksetClient(apikey)
  }
}


