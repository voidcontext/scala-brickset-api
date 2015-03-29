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
        "com.typesafe.akka" %% "akka-actor" % "2.3.9",
        "com.typesafe.akka" %% "akka-camel" % "2.3.9",
        "com.typesafe.akka" %% "akka-testkit" % "2.3.9",
        "org.apache.camel" % "camel-core" % "2.15.0",
        "org.apache.camel" % "camel-cxf" % "2.15.0",
        "org.scalatest" %% "scalatest" % "2.2.1" % "test"
      )
    )
  )
}
