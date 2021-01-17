package com.neuedu.chapter4

import scala.util.control.Breaks

object Scala_for {
  def main(args: Array[String]): Unit = {
    //to表示范围，包含起始和结尾的数字
   /* for (i <- 1 to 3) {
      println(i)
    }
    //until表示范围，不包含结尾的数字
    for (i <- 1 until 3) {
      println(i)
    }
    //步长为2
    //1 until 5 ==>1.until(5) 二者等价，
    //实际上until方法返回一个Range对象
    for (i <- 1.until(5, 2)) {
      println(i)
    }

    //循环守卫
    for (i <- 1 to 10 if i % 2 == 0) {
      println(s"i=$i")
    }

    //变量声明

    for (i <- 1 to 9; j = (9 - i) / 2) {
      var str: String = "+" * 10 //在scala中字符串可以用乘号乘以数字
      println(str)
      println(" " * j + "*" * i) //在scala中字符串可以用乘号乘以数字
    }

    //小括号可以换成大括号，并且省略分号
    for {i <- 1 to 9
         j = (9 - i) / 2} {
      var str: String = "+" * 10 //在scala中字符串可以用乘号乘以数字
      println(str)
      println(" " * j + "*" * i) //在scala中字符串可以用乘号乘以数字
    }

    val ints = for (i <- 1 to 9) yield i * 10 //yield指将每次循环的结果存入一个scala的vector中去

    println(ints.getClass)

    //中断循环 scala中没有break关键字，采用对象的方式：Breaks.break方法会报异常，需要添加Break.breakable()来运行中断异常

    Breaks.breakable({
      for (i <- 1 to 10) {
        if (i == 5) {
          Breaks.break()
        }
        println(i)
      }
    })

    println("循环结束")
*/

    //breakable模拟continue
    for(i <- 1 to 10){
      Breaks.breakable{
        if(i%2==0) Breaks.break()
        println(i)
      }

    }
  }
}
