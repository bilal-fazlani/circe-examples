// package com.bilalfazlani.encoding

// import io.circe.generic.extras._
// import io.circe.generic.extras.auto._
// import io.circe.syntax._

// object CustomKeys extends App {
//   sealed trait Entity
//   case class Data(@JsonKey("ID") id: String) extends Entity

//   val data: Entity = Data("asds2")

//   implicit val genDevConfig: Configuration =
//     Configuration.default.withDiscriminator("_type")

//   println(data.asJson)
// }
