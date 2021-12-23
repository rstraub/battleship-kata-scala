import Dependencies._

val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Battleship Kata",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += scalaTest % Test
  )
