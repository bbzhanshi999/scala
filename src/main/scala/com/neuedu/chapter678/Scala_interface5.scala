package com.neuedu.chapter678

object Scala_interface5 {
  def main(args: Array[String]): Unit = {
    //动态混入特质
    val mysql = new Mysql18
    mysql.insert()
    mysql.getMessage
  }
}
//特质可以继承类
trait Operate18 /*extends Exception*/{
  //特质使用的范围
  this:Exception =>
  def insert (): Unit ={
    println("插入數據")
    this.getMessage
  }
}

class Mysql18 extends Exception with Operate18 {


}