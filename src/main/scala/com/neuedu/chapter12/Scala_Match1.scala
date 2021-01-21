package com.neuedu.chapter12

object Scala_Match1 {
  def main(args: Array[String]): Unit = {
    //特殊模式匹配，类似js结构语法
    var (x,y) = (1,2)
    var (username,email,age) = ("wewewewewe","wewew",12)
    println(username+email+age)
    println(x+y)

    val (q,r) = BigInt(10) /% 3
    println(q)
    println(r)
    val t = BigInt(10) /% 3
    println(t)

    val arr = Array((1,"10"),(2,"20"))
    for((k,v)<-arr){
      println(s"$k=$v")
    }
  }
}
