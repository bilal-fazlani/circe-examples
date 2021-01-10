package com.bilalfazlani.decoding

import io.circe.generic.extras._
import io.circe.generic.extras.auto._
import io.circe.parser.decode

object CustomKeys extends App {

  sealed trait Entity
  case class Data(@JsonKey("ID") id: String) extends Entity

  val data =
    """
      |{
      |  "ID": "asdasd"
      |}
      |""".stripMargin

  implicit val genDevConfig: Configuration =
    Configuration.default.withDiscriminator("_type")

  println(decode[Data](data))
}
