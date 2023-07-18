package com.lannstark.lec09

class Person(var name: String = "이유현",
             var age: Int = 3) {
  init {
    if (age <= 0) {
      throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
    }
  }

//  var name = name
//    set(value) {
//      field = value.uppercase()
//    }

  fun updateName(value: String) {
    this.name = value
  }

//  fun getUppercaseName(): String {
//    return this.name.uppercase()
//  }

//  val name = name
//    get() = field.uppercase()
//  constructor(name: String): this(name, 1)

//  fun isAdult(): Boolean {
//    return this.age >= 20
//  }

//  val isAdult: Boolean
//    get() = this.age >= 20

}

fun main() {
  var person = Person("baekho", 1)
  print(person.age.toString() + " ")
  print(person.updateName("baekho2"))
  person.age = 30
  println()
  print(person.age.toString() + " ")
  print(person.name)

  val javaPerson = JavaPerson("자바맨", 3)
  println()
  javaPerson.age = 2
  print(javaPerson.age.toString() + " ")
  print(javaPerson.name)
}