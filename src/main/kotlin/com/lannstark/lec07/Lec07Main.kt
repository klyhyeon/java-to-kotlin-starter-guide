package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun parseIntOrThrow(str: String): Int? {
  return try {
    str.toInt()
  } catch (e: NumberFormatException) {
    null;
//    throw IllegalArgumentException("주어진 $str 는 정수가 아닙니다!")
  } finally {
    print("finally")
  }
}

fun readFile() {
  val currentFile = File(".")
  val file = File(currentFile.absolutePath + "/a.txt")
  val reader = BufferedReader(FileReader(file))
  println(reader.readLine())
  reader.close()
}