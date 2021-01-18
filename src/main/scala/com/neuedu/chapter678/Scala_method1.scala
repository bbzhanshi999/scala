package com.neuedu.chapter678

object Scala_method1{
  def main(args: Array[String]): Unit = {
    //采用伴生对象生成伴生类对象
    val student = Student //等同于调用apply
    println(student)

    val stu2 = Student(1) //实际调用的是apply方法创建伴生类对象
    println(stu2)

    val range = Range(1,5)
    println(range)

  }
}
