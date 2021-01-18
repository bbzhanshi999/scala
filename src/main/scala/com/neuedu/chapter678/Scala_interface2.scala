package com.neuedu.chapter678

//接口
//scala中构造函数执行顺序：
object Scala_interface2 {
  def main(args: Array[String]): Unit = {
    new User15()
  }
}

//特质和父类没有关系，只和当前混入的类有关系，在调用时，父类先执行，然后当前混入的特质在执行，
//如果父类也混入了相同特质，那么特质初始化只会一次
trait TestTrait15 {
  println("trait running")
}

class Person15 extends TestTrait15{
  println("father running")

}

class User15 extends Person15 with TestTrait15 {
  println("son running")

}