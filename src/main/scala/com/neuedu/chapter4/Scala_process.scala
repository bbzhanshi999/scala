package com.neuedu.chapter4

object Scala_process {
  def main(args: Array[String]): Unit = {
    var flag = true
    val value = if (flag) {
      var str: String = "a"
      str + "b" //if的返回值为满足条件的最后一行代码
      println("b")
    }
    println(value.getClass)
    if(flag) println("a") else println("b")
    var c:String = if(flag) "a" else "b"
    println(c)
  }
}
