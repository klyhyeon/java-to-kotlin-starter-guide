package com.baekho.lec10

class Cat(
  species: String
) : Animal(species, 4) {

  override fun move() {
    println("고양이는 살금살금")
  }
}