package com.github.qiubix

import org.scalatest._

class StringCalculatorTest extends FlatSpec with Matchers {

  "String calculator" should "return 0 for an empty string" in {
    StringCalculator.add("") should be (0)
  }

}
