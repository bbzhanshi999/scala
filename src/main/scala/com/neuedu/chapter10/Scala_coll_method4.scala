package com.neuedu.chapter10

import scala.collection.mutable

object Scala_coll_method4 {
  def main(args: Array[String]): Unit = {
    //将两个map相同key 的值要做累加
    //a-》4 b->2 c->5 d-》1
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)

    val value = map1.foldLeft(map2)((map, t) => {
      map(t._1) = map.getOrElse(t._1, 0) + t._2
      map
    })

    println(value)
  }
}

