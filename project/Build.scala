package build

import sbt._
import Keys._
import xerial.sbt.Sonatype.SonatypeKeys._
import xerial.sbt.Sonatype.sonatypeSettings
import sbtscalaxb.Plugin._
import sbtscalaxb.Plugin.ScalaxbKeys._

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

  val dispatchV = "0.11.2"

  val myScalaxbSettings = Seq(
    sourceGenerators in Compile += (scalaxb in Compile).taskValue,
    dispatchVersion in scalaxb in Compile := dispatchV,
    async in scalaxb in Compile           := true,
    packageName in scalaxb in Compile     := "io.github.voidcontext.bricksetclient.api"
  )

  lazy val root = Project(
    "brickset-client",
    file("."),
    settings = Defaults.defaultSettings ++ sonatypeSettings ++ publishSettings
      ++ scalaxbSettings ++ myScalaxbSettings ++ Seq(
      name := "bricksetclient",
      organization := "io.github.voidcontext",
      version := "0.3.0-SNAPSHOT",
      scalaVersion := "2.11.6",
      scalacOptions := Seq("-feature", "-deprecation"),
      libraryDependencies ++= Seq(
        "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1",
        "net.databinder.dispatch" %% "dispatch-core" % dispatchV,
        "org.scalatest" %% "scalatest" % "2.2.1" % "test"
      )
    )
  )

  lazy val example = Project(
    "brickset-client-example",
    file("examples"),
    settings = Seq(
      version := "0.3.0-SNAPSHOT",
      scalaVersion := "2.11.6",
      scalacOptions := Seq("-feature", "-deprecation")
    )
  ).dependsOn(root)
}
