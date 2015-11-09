package com.github.qiubix

object StringCalculator {

  def sum(numbers : String, result : Integer) : Integer = {
    if (numbers.isEmpty) result
    else if (numbers.head == ',')
      result + sum(numbers.tail, result)
    else
      sum(numbers.tail, numbers.head.toString.toInt)
  }

  def add(numbers : String) : Integer = {
    if (numbers.isEmpty) 0
    else sum(numbers, 0)
  }

}
