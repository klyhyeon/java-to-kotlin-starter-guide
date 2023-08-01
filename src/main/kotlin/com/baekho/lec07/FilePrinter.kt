package com.baekho.lec07

import java.io.BufferedReader
import java.io.FileReader

/**
 * TODO Kotlin은 모두 unchecked exception이라서 예외 처리할 필요없다.
 */

class FilePrinter {

  fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
      println(reader.readLine())
    }
  }

  fun parseIntOrThrow(str: String): Int? {
    return try {
      str.toInt()
    } catch (e: NumberFormatException) {
      null
    } finally {
      print("finally")
    }
  }
 }