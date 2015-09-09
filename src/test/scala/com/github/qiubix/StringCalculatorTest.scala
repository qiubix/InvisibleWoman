package com.github.qiubix

import org.scalatest._

class StringCalculatorTest extends FlatSpec with Matchers {

  "String calculator" should "return 0 for an empty string" in {
    StringCalculator.add("") should be (0)
  }

  "String calculator" should "return 1 for a string with single one" in {
    StringCalculator.add("1") should be (1)
  }

  "String calculator" should "return 2 for a string with single two" in {
    StringCalculator.add("2") should be (2)
  }

}
