package io.github.voidcontext.bricksetclient

package object client {
  type LoginResult = Either[InvalidCredentialsError, String]
}
