package com.baekho.lec06

fun main() {
  val numbers1 = listOf(1L, 2L, 3L)
  val numbers2 = listOf(1L, 2L, 3L)

  for (i in 1..5 step 2) {
    println(i)
  }

  var i = 1
  while (i <= 3) {
    println(i)
    i++
  }

  for (i in 1..3) {
    println(i)
  }

  for (i in numbers2.size downTo 0) {
    println("downTo")
    println(i)
  }
}