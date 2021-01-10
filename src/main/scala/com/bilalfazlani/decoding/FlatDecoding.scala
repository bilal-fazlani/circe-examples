package com.bilalfazlani.decoding

//the order of these imports matter
import io.circe.generic.extras.Configuration
import io.circe.generic.extras.auto._
import io.circe.parser.decode
import com.bilalfazlani._

object FlatDecoding extends App {
  val managerPerson =
    """{
      |  "id":123,
      |  "name":"asdasdasd",
      |  "_type":"Manager"
      |}
      |""".stripMargin

  implicit val genDevConfig: Configuration =
    Configuration.default.withDiscriminator("_type")

  println(decode[Person](managerPerson))
}
