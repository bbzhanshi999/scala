package com.neuedu.chapter678


object Scala_Class2 {
  def main(args: Array[String]): Unit = {
    val user = new Person12("asd")
    println(user.name)
  }
}



//scala可将主构造函数入参直接在参数声明中声明为变量
class Person12(var name: String) {
  println("主构造方法person")
//  var name:String = s
}