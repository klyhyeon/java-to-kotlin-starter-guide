package com.baekho.lec10

class Penguin(
  species: String,
) : Animal(species, 2), Swimable, Flyable {

  private val wingCount: Int = 2

  override fun move() {
    println("펭귄이 움직입니다~")
  }

  //TODO 상위 클래스 필드를 override 하려면 상위 클래스 필드에 open을 붙여줘야 한다.
  override val legCount: Int
    get() = super.legCount + this.wingCount

  override fun act() {
    super<Swimable>.act()
    super<Flyable>.act()
  }


}