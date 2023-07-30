package com.baekho.lec01

class Person(
  val name: String,
)

fun main() {
  println(Person("유현").name)

  var number1 = 10
  val number2 = 10L

  var number3 = 1_000L
}