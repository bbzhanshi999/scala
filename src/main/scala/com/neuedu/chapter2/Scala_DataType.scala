package com.neuedu.chapter2

object Scala_DataType {

  def main(args: Array[String]): Unit = {
    val age:Int =20
    val b:Byte =10
    val s:Short=10
    val lon:Long=10
    val f: Float = 10.99f
    val d:Double = 19
    val bln:Boolean=true
    val c:Char='1'
    val ii:Integer = 10 //无缝嵌入java

    println(age+ii)
    println(19.equals(20)) //Int也是对象，因此有方法equals
  }
}
