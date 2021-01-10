package com.bilalfazlani.encoding

import io.circe.generic.extras.Configuration
import io.circe.generic.extras.auto._
import com.bilalfazlani._
import io.circe.syntax._

object FlatEncoding extends App {
  val person: Person = Employee(3, "asds", 43)
  implicit val genDevConfig: Configuration =
    Configuration.default.withDiscriminator("_type")

  println(person.asJson)
}
