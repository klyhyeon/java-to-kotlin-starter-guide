package com.lannstark.lec10

import java.sql.Driver

fun main() {
  val derived = Derived(300)
  println(derived.number)
}

open class Base() {
  init {
    println("Base Class")
  }
}


class Derived(
  val number: Int
) : Base() {

  init {
    println("Drived Class")
  }
}