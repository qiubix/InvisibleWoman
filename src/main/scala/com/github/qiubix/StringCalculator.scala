package com.github.qiubix

object StringCalculator {

  def add(numbers : String) : Integer = {
    if (numbers.isEmpty) 0
    else numbers.toInt
  }

}
