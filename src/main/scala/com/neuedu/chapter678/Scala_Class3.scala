package com.neuedu.chapter678

//接口
//scala中没有接口的概念，有特质（trait）的概念，类似于接口
object Scala_Class3 {
  def main(args: Array[String]): Unit = {

  }
}
//声明特质
trait TestTrait {

}
trait TestTrait1 {

}
class Person13{

}

//特质可以继承.,所以使用extends
//如果继承多个trait，用with连接
//如果类同时存在父类和特质，依然采用继承方式，但是继承父类，连接（mixin混入）特质
class User13 extends Person13 with TestTrait with TestTrait1 {

}