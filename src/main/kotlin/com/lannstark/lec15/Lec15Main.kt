package com.lannstark.lec15

fun main() {

  val array = arrayOf(100, 200)
  val newArray = array.plus(300)
  for (value in newArray ) {
    println("$value")
  }

  val list = listOf(100, 200)
  val emptyList = emptyList<Int>()

  val mutableList = mutableListOf(100, 200)

  val map = mapOf(1 to "MONDAY", 2 to "TUESDAY")

  val map2 = mutableMapOf<Int, String>()
  map2[1] = "MONDAY"
  map2[2] = "TUESDAY"

  for (key in map) {
    println(key)
  }

  for ((key, value) in map2) {
    println("key: $key , value: $value")
  }
}