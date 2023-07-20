package com.lannstark.lec12

class Person private constructor(
  var name: String,
  var age: Int
) {

  companion object {
    private const val MIN_AGE = 1

    @JvmStatic
    fun newBaby(name: String) = Person(name, MIN_AGE)
  }
}

fun main() {
  val newBaby = Person.newBaby("유지")
  println("newBaby's name is $newBaby")

  println(Singleton.a)
  Singleton.a += 10
  println(Singleton.a)

  moveSomething(object : Movable {
    override fun move() {
      println("무브 무브")
    }

    override fun fly() {
      println("날다 날다")
    }
  })
}

private fun moveSomething(movable: Movable) {
  movable.move()
  movable.fly()
}

object Singleton {
  var a: Int = 0
}