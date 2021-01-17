package com.neuedu.chapter678





//import导入类
//import可以在任意的地方使用
//import可以导入一个包中所有的类，采用下划线代替java中的*
//import java.util._
//导入包中多个类，采用花括号解构语法{}
//import java.util.{List,Map}

//import可以采用特殊的方式隐藏特定的类{类名=>_}
/*import java.util.Date
import java.sql.{Date=> _}*/

//import可以真正的导包
//import java.util
import _root_.java.util.Date


object Scala_import{
  def main(args: Array[String]): Unit = {
//    import java.util.Date
    val date = new Date() //导包后，就把包当成对象
    println(date)
  }
}

