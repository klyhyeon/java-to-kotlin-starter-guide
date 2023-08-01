package com.baekho.lec05

fun main() {
  judgeNumber2(55)
  println(judgeNumber3(70))
}

fun judgeNumber(number: Int) {
  when (number) {
    1, 0, -1 -> println("많이 본 숫자입니다.")
    else -> println("모르는 숫자입니다.")
  }
}

private fun judgeNumber2(number: Int) {
  when {
    number == 0 -> println("주어진 숫자는 0입니다")
    number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
    else -> println("주어지는 숫자는 홀수입니다.")
  }
}

fun judgeNumber3(number: Int): String {
  return when(number) {
    in 90..99 -> "A"
    in 80..89 -> "B"
    else -> "C"
  }
}

fun getGrade(number: Int): String {
  return if (number >= 90) {
    "A"
  } else if (number >= 80) {
    "B"
  } else {
    "D"
  }
}

fun validateScore(score: Int) {
  if (score !in 0..100) {
    throw IllegalArgumentException("")
  }
}

fun startsWithA(obj: Any): Boolean {
  return when (obj) {
    is String -> obj.startsWith("A")
    else -> false
  }
}