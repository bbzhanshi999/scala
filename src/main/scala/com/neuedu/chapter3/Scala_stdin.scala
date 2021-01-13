package com.neuedu.chapter3

import scala.io.StdIn

object Scala_stdin {
  def main(args: Array[String]): Unit = {
    val value:String = StdIn.readLine()
    println(value)

    val i = StdIn.readInt()
    println(i)
  }
}
