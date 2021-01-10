package com.bilalfazlani.encoding

import com.bilalfazlani.Manager
import io.circe.Codec
import io.circe.syntax._

object NoMagic extends App {
  val manager = Manager(123, "bilal")

  implicit val managerCodec: Codec[Manager] = Codec
    .forProduct2("id", "name")(Manager.apply)(x => (x.id, x.name))

  val managerJson = manager.asJson

  println(managerJson)
}
