package com.neuedu.datastructure

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object sparse_array {


  /*需求
  * 原始数组：
0 0 0 0 0 0 0 0 0 0 0
0 0 1 0 0 0 0 0 0 0 0
0 0 0 2 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 --》
* 稀疏数组：
(11,11,2)
(1,2,1)
(2,3,2)--》
* 恢复的二维数组
0 0 0 0 0 0 0 0 0 0 0
0 0 1 0 0 0 0 0 0 0 0
0 0 0 2 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 */

  /**
   * 稀疏数组实现
   * @param args
   */

  def main(args: Array[String]): Unit = {
    val col = 11
    val row = 11
    val chessMap: Array[Array[Int]] = Array.ofDim(row, col)
    chessMap(1)(2) = 1
    chessMap(2)(3) = 2

    println("原始数组：")
    for(row <- chessMap){
      for(item <- row){
        print(s"$item ")
      }
      println
    }

    //创建稀疏数组
    val sparseArray: ArrayBuffer[(Int, Int, Int)] = ArrayBuffer((row, col, 0))

    //二维数组转换稀疏数组
    for(r:Int <- chessMap.indices){
      for( c:Int <- chessMap(r).indices){
        if (!chessMap(r)(c).equals(0)){
          sparseArray.append((r,c,chessMap(r)(c)))
        }
      }
    }
    val count: Int = sparseArray.foldLeft(0)((sum: Int, _: (Int, Int, Int)) => sum + 1)-1
    sparseArray(0) = (sparseArray(0)._1,sparseArray(0)._2,count)
    println("稀疏数组：")
    for(item<-sparseArray){
      println(item)
    }

    //稀疏数组恢复二维数组
    val chessMap2: Array[Array[Int]] = Array.ofDim(sparseArray(0)._1, sparseArray(0)._2)
    for(i <- 1 to sparseArray(0)._3){
      chessMap2(sparseArray(i)._1)(sparseArray(i)._2) = sparseArray(i)._3
    }

    println("恢复的二维数组")
    for(row <- chessMap2){
      for(item <- row){
        print(s"$item ")
      }
      println
    }

  }
}
