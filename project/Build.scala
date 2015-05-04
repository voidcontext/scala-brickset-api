package build

import sbt._
import Keys._
import xerial.sbt.Sonatype.SonatypeKeys._
import xerial.sbt.Sonatype.sonatypeSettings

object BricksetClientBuild extends Build {
  val publishSettings = Seq(
    profileName := "io.github.voidcontext",
    publishMavenStyle := true,
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots") 
      else
        Some("releases"  at nexus + "service/local/staging/deploy/maven2")
    },
    pomExtra := {
      <url>https://github.com/voidcontext/scala-brickset-client</url>
      <licenses>
        <license>
          <name>MIT</name>
          <url>http://opensource.org/licenses/MIT</url>
        </license>
      </licenses>
      <scm>
        <connection>scm:git:github.com/voidcontext/scala-brickset-client</connection>
        <developerConnection>scm:git:git@github.com:voidcontext/scala-brickset-client</developerConnection>
        <url>github.com/voidcontext/scala-brickset-client</url>
      </scm>
      <developers>
        <developer>
          <id>voidcontext</id>
          <name>Gabor Pihaj</name>
          <url>http://voidcontext.github.io</url>
        </developer>
      </developers>
    }
  )

  lazy val root = Project(
    "brickset-client",
    file("."),
    settings = Defaults.defaultSettings ++ sonatypeSettings ++ publishSettings ++ Seq(
      name := "bricksetclient",
      organization := "io.github.voidcontext",
      version := "0.2.0",
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
