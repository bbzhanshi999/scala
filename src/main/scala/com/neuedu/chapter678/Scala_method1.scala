package com.neuedu.chapter678

object Scala_method1{
  def main(args: Array[String]): Unit = {
    //采用伴生对象生成伴生类对象
    val student = Student //等同于调用apply
    println(student)

    val range = Range(1,5)
    println(range)

  }
}
