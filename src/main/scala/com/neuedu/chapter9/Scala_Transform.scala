package com.neuedu.chapter9

object Scala_Transform {
  def main(args: Array[String]): Unit = {
    //自动转换 - 隐式转换
    //scala默认的情况下支持数值类型的自动转换
    // byte-> short ->int ->lang
    //scala默认的情况下支持多态语法的类型转换
    // child->parent->trait
    //scala允许开发人员自定义转换规则
    //将两个无关的类型通过编程手段让他们自动转换
    //注意：在相同作用域内，相同类型的转换规则只能有一个
    implicit def transform(d:Double):Int = {
      d.toInt
    }

    val i:Int = 5.0
    println(i)
  }
}
