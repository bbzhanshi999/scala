package com.neuedu.chapter13

object Scala_partial {

  def main(args: Array[String]): Unit = {
    val value: List[Any] = List(1, 2, 3, 4, "4")

    //偏函数相当于是map和filter的组合
    val parfun = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = v1.asInstanceOf[Int]+1
    }

    println(value.collect(parfun))

    //偏函数简化形式
    println(value.collect{case x:Int => x+1})
  }
}