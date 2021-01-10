package com.bilalfazlani.encoding

import io.circe.generic.extras.Configuration
import io.circe.generic.extras.auto._
import io.circe.syntax._

object FlatEncoding extends App {
  sealed trait Person
  case class Employee(id: Int, name: String, managerId: Int) extends Person
  case class Manager(id: Int, name: String) extends Person

  val person: Person = Employee(3, "asds", 43)
  implicit val genDevConfig: Configuration =
    Configuration.default.withDiscriminator("_type")

  println(person.asJson)
}
