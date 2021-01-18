package com.neuedu.chapter678


object Scala_Class2 {
  def main(args: Array[String]): Unit = {
//    val user = new Person12("asd")

//    println(user.name)
  }
}

object Person12{
  def main(args: Array[String]): Unit = {
    var p = Person12()
  }
}


//scala可将主构造函数入参直接在参数声明中声明为变量
//构造函数私有化
class Person12 private (var name: String) {
  println("主构造方法person")
//  var name:String = s
  def apply(name:String)=new Person12(name)
}