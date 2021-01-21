package com.neuedu.chapter10

/*继承app以后，可以直接运行，不用谢main函数 app是一个特质类*/
object Scala_ClassInfo1 extends App{

  println("zhangsan ....")
  println(Color.RED.id)
}
//枚举
object Color extends Enumeration{
  //隐式转换
  var RED = Value(1,"RED")
  var YELLOW = Value(2,"YELLOW")
}
