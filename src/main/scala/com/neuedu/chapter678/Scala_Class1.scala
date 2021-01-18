package com.neuedu.chapter678

//父类构造函数调用
object Scala_Class1 {
  def main(args: Array[String]): Unit = {
    val user = new User11("asd")

  }
}

//父类，继承
//父类没有无参构造时，子类的主构造函数也需要有参，而无参的是辅助构造函数
class User11(s:String)  extends Person11(s) {

  println("主构造办法User11")

  def this() {
    this("ssss")
    println("辅助构造方法User11")

  }
}

//抽象类与抽象方法
abstract class Person11(s:String) {
  println("主构造方法person")
}