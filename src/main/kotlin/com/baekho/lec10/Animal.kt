package com.baekho.lec10

abstract class Animal(
  protected val name: String,
  protected open val legCount: Int,
) {

  abstract fun move()


}