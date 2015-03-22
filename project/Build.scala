package build

import sbt._
import Keys._

object BricksetClientBuild extends Build {
  lazy val root = Project(
    "brickset-client",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(
      name := "scala-brickset-client",
      version := "0.0.1-SNAPSHOT",
      scalaVersion := "2.11.6",
      libraryDependencies ++= Seq(
        "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
      )
    )
  )
}
