package com.neuedu.chapter678

object Scala_Class {
  def main(args: Array[String]): Unit = {
    val user10: Person = new User10 //多态
    user10.name = "zaasas"
    user10.test1() //与java一样，调用的仍然是user10类的test1方法
    println(user10.email)
  }
}

//父类，继承
class User10 extends Person {
  //override关键字可以省略,如果是实现抽象方法的话
  def test(): Unit = {
    println(this.name)
  }

  //与java一样，子类覆盖父类的方法，但是需要加override
  override def test1(): Unit = println("test1 from son")

  //实现属性抽象，其实java底层用的是抽象方法来实现所谓的抽象属性
  var sex: String = _

  //重写属性也要加override,被覆盖的属性不能是父类的var变量
  override val email:String = "xxx"
}

//抽象类与抽象方法
abstract class Person {
  var name: String = _
  //scala中属性也可以是抽象的，因此scala中属性也可以被重写
  //属性没有初始化，就是抽象的，其实java底层用的是抽象方法来实现所谓的抽象属性
  var sex:String

  val email:String = "yyyy"
  //抽象方法只有声明没有实现
  def test(): Unit

  def test1(): Unit = {
    println("test1 from father")
  }
}