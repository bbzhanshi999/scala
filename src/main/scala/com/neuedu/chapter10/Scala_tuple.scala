package com.neuedu.chapter10


object Scala_tuple {
  def main(args: Array[String]): Unit = {
    //Tuple元祖
    //将无关的数据当成一个整体来使用
    //empid，email，ordernum
    // 使用一个小括号将数据关联在一起，形成一个整体
    //tuple中的元素最多22个
    val tuple: (String, Int, String) = ("zhangsan", 11, "xxxxx")
    //访问tuple,_顺序号
    println(tuple._1)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    //循环遍历
    for(el <- tuple.productIterator){
      println(el)
    }
    //tuple一旦创建，元素不可增加

    //如果tuple中就两个元素，称之为对偶，类似于map中的键值对
    val tuple1: (Int, String) = (1, "zhangsan")
    val tMap:Map[Int,String] = Map((1, "zhangsan"))
    tMap.foreach((t: (Int, String)) =>println(s"${t._1}:${t._2}")) //map的foreach中得到参数是元祖Tuple2
  }
}
