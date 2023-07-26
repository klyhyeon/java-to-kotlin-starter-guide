package com.lannstark.lec17

fun main() {

  /**
   * Java에서 람다 함수는 파라마터로 메서드를 바로 받을 수 없고 인터페이스를 받는다(2급 시민)
   *
   * Kotlin에서는 함수가 변수에 할당할수도, 파라미터로 넘겨줄수도 있다.
   */

  /**
   * Closure
   *  Kotlin은 람다 함수가 호출되는 시점에 변수들을 모두 포획해서 그 정보를 가지고 있다. (1급 시점)
   */

  val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
  }

  val isApple2 = { fruit: Fruit -> fruit.name == "사과"}

  isApple.invoke(Fruit("사과", 1_000))
  isApple2(Fruit("배", 2_000))

  filterFruit(listOf(Fruit("사과", 1_000))) { it.name == "사과"}
}

private fun filterFruit(
  fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
  val result = mutableListOf<Fruit>()
  for (fruit in fruits) {
    if (filter(fruit)) {
      result.add(fruit)
    }
  }
  return result
}

