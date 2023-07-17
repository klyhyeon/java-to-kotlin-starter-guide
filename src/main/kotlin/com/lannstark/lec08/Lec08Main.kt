package com.lannstark.lec08

fun max(a: Int, b: Int) = if (a < b) a else b

fun main() {
  repeat("test", userNewLine = false)
  printNameAndGender(gender = "FEMALE", name = "이유현")

  val array = arrayOf("A", "B")
  printAll(*array)

}

fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
  for (i in 1..num) {
    println(str)
  }
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