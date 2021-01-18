package com.neuedu.chapter10

import scala.collection.mutable


object Scala_map {
  def main(args: Array[String]): Unit = {
    // map集合 k-v
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2: Map[String, Int] = map.+("d" -> 5)
    println(map)
    println(map2)


    //可变map集合
    val mMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    //删除元素
    val mMap2: mutable.Map[String, Int] = mMap - "a"
    println(mMap)
    println(mMap2)

    //修改数据
    mMap.update("a", 11)
    println(mMap)

    //循环遍历
    println(mMap.get("a"))
    println(mMap.get("a").get)
    println(mMap("a")) //等价于上面，
    //scala为了防止空指针异常，提供了一个特殊的类Option,有两个特殊的实现对象，Some，None
    //    println(mMap("f")) //报空指针，因为key为f的元素没有
    val value: Int = mMap.getOrElse("f", 10)
    println(value)
    map.foreach((x: (String, Int)) => println(x.getClass))
  }
}
