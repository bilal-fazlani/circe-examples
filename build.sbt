name := "circepoc"

version := "0.1.0-SNAPSHOT"

scalaVersion := "3.0.0-RC1"
resolvers += Resolver.JCenterRepository

val circeVersion = "0.14.0-M4"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-extras" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
)
