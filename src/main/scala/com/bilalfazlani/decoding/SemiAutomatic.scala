package com.bilalfazlani.decoding

import com.bilalfazlani._
import io.circe.Decoder
import io.circe.generic.semiauto._
import io.circe.parser.decode

object SemiAutomatic extends App {
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

  implicit val employeeDecoder: Decoder[Employee] = deriveDecoder
  implicit val managerDecoder: Decoder[Manager] = deriveDecoder
  implicit val personDecoder: Decoder[Person] = deriveDecoder

  println(decode[Employee](employee))
  println(decode[Manager](manager))
  println(decode[Person](managerPerson))
}
