package com.bilalfazlani.decoding

import com.bilalfazlani.Manager
import io.circe.Codec
import io.circe.parser.decode

object NoMagic extends App {
  val managerJson =
    """
      |{
      |  "id": 123,
      |  "name": "bilal"
      |}
      |""".stripMargin

  implicit val managerCodec: Codec[Manager] = Codec
    .forProduct2("id", "name")(Manager.apply)(x => (x.id, x.name))

  val manager = decode[Manager](managerJson)

  println(manager)
}
