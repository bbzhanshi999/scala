package com.neuedu.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala_array {
  def main(args: Array[String]): Unit = {
    //scala中集合分为两大类：可变mutable & 不可变immutable

    //scala中数组，使用Array对象实现，使用中括号声明数组的类型
    //Array[String]
    // scala可以用apply来创建
    val ints: Array[Int] = Array(1, 2, 3, 4)
    //访问数组:使用小括号，增加索引的方式来访问数组
    /*println(ints(0))
    //数组的长度
    println(ints.length)

    //将数组转换成字符串
    println(ints.+("sssss"))
    println(ints.mkString(" "))

    //将数组中的每个元素打印出来
    for(el <- ints){
      println(el)
    }
    ints.foreach(println)*/

    //修改数组元素
    /*ints.update(0,10)
    ints.foreach(println)*/

    //增加元素
    //采用：+方法是添加元素生成新的数组，对原数组没影响
 /*   val ints1 = ints :+ 5
    val ints2 = 5 +: ints //与上面代码的区别在于5是添加到数组前面的，但是也会生成新数组
   /* ints2.foreach(println)
    ints1.foreach(println)*/
    println(ints1.mkString(","))
    println(ints2.mkString(","))
    println(ints1==ints)*/

    //可变数组
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
    println(arrayBuffer(0))

    //存值,修改值
    arrayBuffer(1) = 10
    println(arrayBuffer.mkString("|"))
    //遍历
    arrayBuffer.foreach(println)

    //增加数据
    //向指定的位置增加元素。如果位置上已经有元素，就覆盖
    arrayBuffer.insert(1,12) //注意不能跳过角标
    val buffer = arrayBuffer += 9
    println(arrayBuffer.mkString("|"))
    println(buffer==arrayBuffer) //新的引用与老的引用地址一致，可变的就是如此

    //删除数据
//    val i = arrayBuffer.remove(1)
//    println(i)
      arrayBuffer.remove(1,2) //从第一位开始删除2个元素
      arrayBuffer.-=(1) //删除一个元素
      println(arrayBuffer.mkString(" "))

    //可变数组与不可变的转换
    val buffer1: mutable.Buffer[Int] = ints.toBuffer
    val array: Array[Int] = arrayBuffer.toArray
  }
}
