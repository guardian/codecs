package com.gu.codecs.owasp

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class OracleCodecTest extends FunSuite with ShouldMatchers {

  val codec = new OracleCodec

  test("Should encoded plain unchanged") {
    codec.encode("piece of text") should be("piece of text")
  }

  test("Should escape apostrophies") {
    codec.encode("piece of 'text'") should be("piece of ''text''")
  }

}