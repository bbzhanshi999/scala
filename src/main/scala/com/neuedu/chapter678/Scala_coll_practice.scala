package com.neuedu.chapter678

object Scala_coll_practice {

  def main(args: Array[String]): Unit = {
    //将如下集合实现wordCount
    val origin = List(("hello scala world", 4), ("hello world", 3), ("hello hadoop", 2), ("hello hbase", 1))
    var temp = origin.flatMap(t => t._1.split(" ").map(s => (s, t._2)))
      .groupBy(t => t._1).map(t => t._2.reduce((t1, t2) => (t1._1, t1._2 + t2._2)))
        .toList.sortWith((t1,t2)=>t1._2>t2._2)
    println(temp)

  }
}
