package com.lannstark.lec06

fun lists() {
  val numbers = listOf(1L, 2L, 3L)
  var numbers2 = listOf(1L, 2L, 3L)

  for (number in numbers) {
    print(number)
  }

  for (number in numbers2) {
    print(number)
  }
}

fun main() {
  for (i in 1..5 step 2) {
    print(i)
  }

  for (i in 1..3) {
    print(i)
  }

  for (i in 3 downTo 0) {
    print(i)
  }

  var i = 1;
  while (i <= 3) {
    print(i)
    i++
  }
}