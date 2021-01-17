package com.neuedu.chapter678


//所谓的方法，其实就是类中声明的函数，所以声明方式和函数是一致的
//调用方法是有区别的，先要有对象
object Scala_method{
  def main(args: Array[String]): Unit = {
    var user = new User07
    val str = user.+("xxxxxx")
    println(str)


  }
}

class User07 {
  def login():Boolean = {
    true
  }

  def logout = {

  }
}