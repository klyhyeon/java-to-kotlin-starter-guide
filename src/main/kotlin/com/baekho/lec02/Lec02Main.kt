package com.baekho.lec02

class Person(
  val name: String,
)

fun main() {
//  println(startsWithA1(null))
  println(startsWithA2(null))
  println(startsWithA3(null))
}

fun startsWithA1(str: String?): Boolean {
  return str?.startsWith("A")
    ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
  return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}