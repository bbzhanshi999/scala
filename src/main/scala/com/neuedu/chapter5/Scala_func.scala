package com.neuedu.chapter5

import java.text.SimpleDateFormat
import java.util.Date

object Scala_func {
  def main(args: Array[String]): Unit = {
    def test(s:String):Unit = {
      println(s)
    }

    test("zhangsan")

    //自动推断简化函数声明
    //1. 函数声明时明确无返回值unit，即使函数中 有return也不起作用
   /* def test1():Unit = {
      return "aaaa"
    }*/
    def test2(flag:Boolean)={
      if(flag)"zhangsan" else 1
    }

    val str = test2(false)
    println(str)

    //如果函数体只有一行，大括号可以省略
    //如果函数没有参数，小括号可省略
    def test3="zhangsan"

    //如果小括号省略，那么访问函数时同样不能带小括号
    println(test3)

    //函数定义时省略等号代表没有返回值,但是省略等号就不能省略大括号
    def test4() {"zhangsan"}

    println(test4()) //()

    //可变参数用*号来表示
    def test5(name:String*) = {
      println(name)
    }
    //调用可变函数时，scala会对数据进行不同的封装，可能是wraapedArray，也可能是list
    test5("1","2","3")
    test5()


    //默认值函数,默认值参数要放在参数列表后面，否则无法使用

    def parseDate(date:String,pattern:String="yyyy-MM-dd HH:mm:ss"):Date={
      val dateFormat:SimpleDateFormat = new SimpleDateFormat(pattern)
      dateFormat.parse(date)
    }

    val date = parseDate("2002-01-01 00:00:00")
    println(date)


    //带名参数更明确
    def printPerson(nickName:String="haha",name:String): Unit ={
      println(s"$name:$nickName")
    }

    printPerson(name="aaa") //调用函数时，可以指定传参对应的是哪一个入参，通过指定参数名称的方式
  }
}
