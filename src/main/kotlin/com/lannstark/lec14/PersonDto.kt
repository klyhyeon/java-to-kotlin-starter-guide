package com.lannstark.lec14

fun main() {
  var dto = PersonDto("유현", 30)
  println(dto.getName())
}

data class PersonDto(
  private val name: String,
  private val age: Int,
) {

  fun getName(): String {
    return this.name
  }
}