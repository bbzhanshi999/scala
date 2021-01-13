package com.neuedu.chapter1

//object是伴生对象，伴生对象都可以直接通过类名来方法其属性和方法
object Hello {
  def main(args: Array[String]): Unit = {
    println("hello world")
    Hello.test()
  }

  def test():Unit = {
    println("test")
  }
}
