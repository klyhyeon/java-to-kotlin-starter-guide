package com.lannstark.lec13

/**
 * 중첩 클래스:
 * 1. Static을 사용하는 중첩 클래스.
 * 2. Static을 사용하지 않는 중첩 클래스
 * - 내부 클래스, ~~지역 클래스~~, ~~익명 클래스~~
 *
 */


//권장되는 중첩 클래스(static)
class House(
  private val address: String,
  private val livingRoom: LivingRoom
) {
  class LivingRoom(
    private val area: Double
  )
}