package com.lannstark.lec14

fun sealed(car: HyundaiCar) {
  return when (car) {
    is Avante -> TODO()
    is Sonata -> TODO()
  }
}

sealed class HyundaiCar(
  val name: String,
  val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)
