import Dependencies._

lazy val root = project
  .in(file("."))
  .settings(
    name := "Battleship Kata",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := projectScalaVersion,

    libraryDependencies += scalaTest % Test
  )
val projectScalaVersion = "2.13.7"
