package com.neuedu.chapter2


object Scala_Data_Parse {
  def main(args: Array[String]): Unit = {
    val i: Int = 10
    val d: Double = i

    var c = i.toDouble
    println(d)
    println(c)
    println(c.toInt)

    var b=null
//    println(b.getClass)

    var str = "19.6"
    var ii:Int = str.toDouble.toInt
    println(ii)

    var ++ = "19"
    print(++)

    var `private` = "123"
    println(`private`)
  }
}
