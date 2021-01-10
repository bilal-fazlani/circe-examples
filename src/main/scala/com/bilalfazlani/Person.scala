package com.bilalfazlani

sealed trait Person
case class Employee(id: Int, name: String, managerId: Int) extends Person
case class Manager(id: Int, name: String) extends Person
