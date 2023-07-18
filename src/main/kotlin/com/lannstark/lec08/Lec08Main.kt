package com.lannstark.lec08

fun max(a: Int, b: Int) = if (a < b) a else b

fun mix(a: Int, b: Int) = if (a > b) b else a

fun main() {
  repeat("test", userNewLine = false)
  printNameAndGender(gender = "FEMALE", name = "이유현")

  val array = arrayOf("A", "B")
  printAll(*array)

  printAll2("A", "B", "C")
}

fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
  for (i in 1..num) {
    println(str)
  }
}

fun repeat2(str: String, num: Int = 2, useNewLine: Boolean = true) {
  println(str)
  println(num)
  println(useNewLine)
}

fun printNameAndGender(name: String, gender: String) {
  println(name)
  println(gender)
}

fun printAll(vararg strings: String) {
  for (str in strings) {
    println(str)
  }
}

fun printAll2(vararg strings: String) {
  for (str in strings) {
    println(str)
  }
}