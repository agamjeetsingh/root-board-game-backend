import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.8.2"

lazy val root = (project in file("."))
  .settings(
    name := "root_board_game",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.13.0"
    )
  )
