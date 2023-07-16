package com.lannstark.lec04

fun main() {
  val money1 = JavaMoney(1_000)
  val money2 = money1
  val money3 = JavaMoney(1_000)

  println(money1 > money2)
}

//data class JavaMoney(val amount: Long) {
//
//  operator fun plus(other: JavaMoney): JavaMoney {
//    return JavaMoney(other.amount + amount)
//  }
//
//
//}