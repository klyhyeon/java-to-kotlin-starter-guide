package com.lannstark.lec06

fun lists() {
  val numbers = listOf(1L, 2L, 3L)
  for (number in numbers) {
    print(number)
  }
}

fun main() {
  for (i in 1..5 step 2) {
    print(i)
  }

  var i = 1;
  while (i <= 3) {
    print(i)
    i++
  }
}