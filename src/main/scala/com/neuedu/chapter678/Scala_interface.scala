package com.neuedu.chapter678

//接口
//scala中没有接口的概念，有特质（trait）的概念，类似于接口
object Scala_interface {
  def main(args: Array[String]): Unit = {
    //java中的接口无法直接创建对象，必须使用实现类
    //java中接口中可以声明方法也可以声明属性，但是属性值默认final无法修改
    //scala中的特质也不能创建对象
    //scala中的特质可以直接写逻辑代码
    val user1 = new User14

    //scala特质中声明的属性和方法都可以在混入的类中使用
    user1.test()
    user1.username = "aaaa"
    println(s"username:${user1.username}")
  }
}

trait TestTrait14 {
  println("trait14 running")
  var username:String = "zhangsan"
  def  test():Unit={
    println("test...."+username)
  }
  //特质中也可声明抽象方法,但是继承特质的类需要实现这个方法
  def test1()
}

class Person14{

}

class User14 extends Person14 with TestTrait14 {
  override def test1(): Unit = {
    println("test1 override")
  }
}