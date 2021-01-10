package com.bilalfazlani.encoding

import com.bilalfazlani._
import io.circe.Encoder
import io.circe.generic.semiauto._
import io.circe.syntax._

object SemiAutomatic extends App {
  implicit val personEncoder: Encoder[Person] = deriveEncoder
  implicit val managerEncoder: Encoder[Manager] = deriveEncoder

  val employee = Employee(3, "asd", 1)
  val manager = Manager(1, "12eas")
  val managerPerson: Person = manager

  println(manager.asJson)
  println(managerPerson.asJson)
}
