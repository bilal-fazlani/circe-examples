name := "circepoc"

version := "0.1"

scalaVersion := "2.13.4"

val circeVersion = "0.14.0-M3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-generic-extras" % "0.13.0"
)
