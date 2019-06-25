package com.xtb.demo.test

import org.junit.Test

class ScalaCommonTest {

  @Test
  def testStr(): Unit = {
    println(List("hello", "world").mkString("_"))
    val list = List("hello")
    val str = List.fill(list.length)("?").mkString("(", ",", ")")
    println(str)
  }
}
