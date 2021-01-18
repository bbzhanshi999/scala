package com.neuedu.chapter678




object Scala_constructor {
  def main(args: Array[String]): Unit = {
    val user: User09 = new User09("aaaa",age=12)
  }
}
//todo scala中的构造方法分为两类： 主构造方法& 辅助构造方法
// scala 构建对象可以通过辅助构造方法黄建，但是必须调用主构造方法
// scala是完全面向函数的语言，因此类也是个函数，因此可以有小括号作为参数列表
// 类所代表的函数其实就是构造函数
// 默认情况下，scala也是提供无参构造函数，所以小括号可以省略
// 在类的后面声明的构造方法就是主构造方法
// 在主构造方法中声明的构造方法就是辅助构造方法
class User09(s: String) {
  //类体 &构造方法体
  println(s)

  //声明辅助构造方法，方法名为this
  def this (){

    this("wangwu") //调用主构造函数
    println("辅助构造函数1")
  }
  //构造函数的顺序要保证，构造函数中调用其他构造函数要先声明过
  def this (s:String,age:Int){
    this()
    println("辅助构造函数2")
  }

}