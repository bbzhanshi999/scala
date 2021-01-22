package com.neuedu.chapter12

object Scala_Match2 {
  def main(args: Array[String]): Unit = {
   //样例类

    //样例类的入参默认就是val，样例类有默认的apply方法
    //样例类还会自动覆盖eq hashcode 和toString方法
    val dollar = Dollar(12.0)
    println(dollar)
  }
}
//密封类sealed意思是他的继承类必须在其同文件下
abstract sealed class Amount
case class Dollar (value:Double) extends Amount
case class Currency (value:Double,unit:String) extends Amount
case object NoAmount extends Amount