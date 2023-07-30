package com.lannstark.lec20

import com.lannstark.lec09.Person


fun printPerson(person: Person?) {

  person?.let {
    println(it.name)
    println(it.age)
  }
}