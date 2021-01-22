package com.neuedu.chapter13

object Scala_AbstractFunction {

  def main(args: Array[String]): Unit = {
    def test(f: => Unit):Unit = {
      f
    }
    test{
      println("xxxx")
    }

    def test1(b:Boolean)(f: => Unit):Unit = {
      if(b)f
    }

    test1(true){
      println("asdsa")
    }
  }
}
