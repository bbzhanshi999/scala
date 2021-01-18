package com.neuedu.chapter9

object Scala_Transform3 {
  def main(args: Array[String]): Unit = {
    //隐式参数默认值
    def test( implicit name:String="zhangsan"):Unit = {
      println(name)
    }

    //隐式值
    implicit val username:String = "wangwu"
    test
    test() //方法调用时，如果带小括号，隐式值无法传递
  }
}
