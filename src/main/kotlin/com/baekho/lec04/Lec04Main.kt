package com.baekho.lec04

class Money(
  val amount: Long,
) {

  operator fun plus(other: Money): Money {
    return Money(this.amount + other.amount)
  }

}

fun main() {
  val money1 = Money(1_000)
  val money2 = Money(2_000)
  println("plus: ${(money1 + money2).amount}")
}