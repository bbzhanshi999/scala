package com.neuedu.chapter678


object Scala_interface4 {
  def main(args: Array[String]): Unit = {
    //动态混入特质
    val mysql = new Mysql17 with Operate17
    mysql.insert()
  }
}

trait Operate17 {

  def insert (): Unit ={
    println("插入數據")
  }
}

class Mysql17 {


}