package com.neuedu.chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala_seq {
  def main(args: Array[String]): Unit = {
    //序列seq
    /*val list:List[Int] = List(1, 2, 3, 4,5)
    val list2:List[Int] = List(5, 6, 7, 8)
    //通过索引获取数据
    println(list(0))

    //添加数据
    val ints: List[Int] = list.+:(5)
    println(ints.mkString(" "))

    //一个集合和另一个集合合并
    val list3: List[Int] = list.++(list2)
    println(list3.mkString(" "))

    //插入集合前面
    val list4: List[Int] = list.::(9)
    println(list4)

    //添加多个数据到list中
    // ::运算符从右到左将数据添加到一个新集合中去
    val list5: List[Int] = 8 :: 9 :: 10 :: 11:: list3

    println(list5.mkString(" "))

    //添加多个元素和别的集合到集合中 , :::三冒号会将集合装入集合

//    var array = Array(1,2,3)
    val list6: List[Int] = 10 :: 8 :: 9 :: 11 :: list ::: list2
    val list7: List[Int] = list6 ::: list2.::(8).::(10)
    println(list6.mkString(" "))
    println(list7.mkString(" "))
*/
    //特殊List集合:空集合
    /*    println(List())
        println(Nil)
        val list: List[Int] = 1 :: 2 :: 3 :: Nil

        //修改并生成新集合
        val list2: List[Int] = list.updated(2, 5)
        println(list)
        println(list2)
        println(list==list2)

        //删除数据。生成新集合
        val list3: List[Int] = list2.drop(10)
        println(list2)
        println(list3)
      */

    //可变list
    /*   val mList1: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
       val mList2: ListBuffer[Int] = mList1.updated(1, 2)
       println(mList1)
       println(mList2)

       //list的头尾
       val head: Int = mList1.head
       println(head)
       println(mList1)
       println(mList1.tail) //除了头都是尾
       println(mList1.last) //最后一个元素
       println(mList1.init) //除了最后一个
       */
    // queue可变队列，
    val q: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)
    q.enqueue(5)
    println(q)
    val i: Int = q.dequeue()
    println(i)
    println(q)
  }
}
