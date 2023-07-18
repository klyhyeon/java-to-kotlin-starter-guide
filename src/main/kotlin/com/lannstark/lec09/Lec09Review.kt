package com.lannstark.lec09

class PersonNew(var name: String,
                var age: Int) {

  init {
    println("init")
  }

  constructor(name: String): this(name, 1)

  fun getUpperCaseName(): String {
    return this.name.uppercase()
  }

}

fun main() {
  val personNew = PersonNew("yu hyeon", 32)
  println("이름: " + personNew.getUpperCaseName())
  println("나이: " + personNew.age.toString())

  val personNewConst = PersonNew("new yu hyeon")
  println("이름: " + personNewConst.getUpperCaseName())
  println("나이: " + personNewConst.age.toString())
}