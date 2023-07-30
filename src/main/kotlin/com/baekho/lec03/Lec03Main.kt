package com.baekho.lec03

class Person(
  val name: String,
  var age: Int,
)

fun main() {
//  printAgeIfPerson(Person("유현", 30))
  printAgeIfPerson(null)
}

fun printAgeIfPerson(obj: Any?) {
  if (obj is Person) {
    //TODO smart-cast
    println("사람의 나이는 ${obj.age}")
  }

  if (obj !is Person) {
    println("사람이 아닙니다.")
  }

  //TODO as?는 타입 캐스트가 안 될 때 null을 반환
  val person = obj as? Person
  println("as로 사람의 나이는 ${person?.age}")
}