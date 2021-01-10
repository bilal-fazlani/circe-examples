package com.bilalfazlani.decoding

import com.bilalfazlani._
import io.circe.generic.auto._
import io.circe.parser.decode

object Automatic extends App {
  val employee =
    """
      |{
      |  "id": 2,
      |  "name": "basd",
      |  "managerId": 123
      |}
      |""".stripMargin
  val manager =
    """
      |{
      |  "id":123,
      |  "name":"asdasdasd"
      |}
      |""".stripMargin
  val managerPerson =
    """
      |{
      |  "Manager":{
      |    "id":123,
      |    "name":"asdasdasd"
      |  }
      |}
      |""".stripMargin

  println(decode[Employee](employee))
  println(decode[Manager](manager))
  println(decode[Person](managerPerson))
}
