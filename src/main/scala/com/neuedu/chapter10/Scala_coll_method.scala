package com.neuedu.chapter10

object Scala_coll_method {
  def main(args: Array[String]): Unit = {
    //集合常用方法
    val list = List(1, 2, 4, 3, 3, 1)
    //求和
    /* println("sum = " + list.sum)
     //最大值
     println("max=" + list.max)
     //最小值
     println("min = "+list.min)
     //求乘积
     println("product = " + list.product)
     //反转
     println("rervese = "+list.reverse)
     //分组(指定函数的余数进行分组)
     val group: Map[Int, List[Int]] = list.groupBy((x: Int) => x % 2)
     println(group)
     //sortBy排序，按照指定规则
     val sortList: List[Int] = list.sortBy(x => x)
     println(sortList)
     println(list)
     println(list.sortWith((x,y)=>x>y)) //降序排序，sortWith自定义牌规则*/

    //迭代
    /*val iterator: Iterator[Int] = list.iterator
    while(iterator.hasNext){
      println(iterator.next())
    }
    for(el <- list.iterator){
      println(el)
    }*/

    //map 映射转换
    //以下代码演示了scala集合通过map实现的强大流式处理能力，统计了每个值出现的次数
    //    println(list.map(x=>(x,x)).groupBy(t=>t._1).map(t=>(t._1,t._2.length)))
    //take取指定个数的值
    //    println(list.take(10))

    //wordCoutn案例：取排名前三字符串出现
    /* val strList:List[String] = List("a","a","a","a","a","B","B","B","B","B","B","B","c","DDD","D","D","D","EEE","EE","EEE")

     val result: List[(String, Int)] = strList.map(s => (s, 1)).groupBy(t => t._1).map(t => (t._1, t._2.size)).toList.sortWith((t1, t2) => t1._2 > t2._2).take(3)
     println(result)*/

    //flatMap扁平化
    /*    var lineList = List("hello world","hello scala","hello hadoop","hadoop hdfs","scala hdfs")
        println(lineList.flatMap(x=>x.split(" ")))*/

    //fliter过滤
    println(list.filter(_ % 2 == 0))
    //拉链zip,将两个集合同位置的元素组成tuple生成tuple集合,新集合长度以短为准
    val list1 = List(1, 2, 3, 11)
    val list2 = List(4, 5, 6,2)
    println(list1.zip(list2))

    //union并集
    println(list1.union(list2))

    //交集
    println(list1.intersect(list2))

    //差集
    println(list1.diff(list2))
    println(list2.diff(list1))
  }
}
