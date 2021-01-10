package com.bilalfazlani.encoding

import com.bilalfazlani._
import io.circe.syntax._
import io.circe.generic.auto._

object Automatic extends App {
  val employee = Employee(3, "asd", 1)
  val manager = Manager(1, "12eas")
  val managerPerson: Person = manager

  println(employee.asJson)
  println(manager.asJson)
  println(managerPerson.asJson)
}
