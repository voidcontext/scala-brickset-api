package io.github.voidcontext.bricksetclient

package object client {
  import scala.util.Try

  type LoginResult = Try[String]
}
