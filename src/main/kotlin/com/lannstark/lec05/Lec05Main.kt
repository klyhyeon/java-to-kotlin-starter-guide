package com.lannstark.lec05

fun judgeNumber2(number: Int): String {
  when {
    number == 0 -> print("주어진 숫자는 0입니다.")
    number % 2 == 0 -> print("주어진 숫자는 짝수입니다.")
    else -> print("주어진 숫자는 홀수입니다.")
  }

  return when(number) {
    in 90..99 -> "A"
    in 80..89 -> "B"
    else -> "C"
  }
}