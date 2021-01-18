package com.neuedu.chapter10

import scala.collection.mutable

object Scala_set {
  def main(args: Array[String]): Unit = {
    //set集合，无序，不可重复
    //默认scala提供的st是不可变的
    val set:Set[Int]  = Set(1,2,3,4,1,5,6,7,8)
    println(set)
    println(set+11) //增加数据生成新set
    println(set-3) //删除数据生成新set
    println(set)
    //可变set
    val mSet: mutable.Set[Int] = mutable.Set(1,2,3,4,5)
    val mSet2: mutable.Set[Int] = mSet - 1
    println(mSet)
    println(mSet2)
    mSet.remove(1)
    println(mSet)
    //修改数据

  }
}
