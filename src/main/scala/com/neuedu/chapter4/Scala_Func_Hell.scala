package com.neuedu.chapter4

object Scala_Func_Hell {
  def main(args: Array[String]): Unit = {
    //TODO SCALA是一个完全面向函数的语言
    //函数在scala中可以做任何的事情
    //函数可以赋值给变量，也可以作为其他函数的参数,函数也可以作为一个函数的返回值
    def test1(): Unit = {
      println("sssss")
    }

    var aaa = test1 _ // _ 代表引入的是函数本身而不是函数执行结果

    aaa()


    /*def test2(func:()=>Unit)={
      func
    }

    test2(test1)()

    var f1:(()=>Unit)=>()=>Unit  = test2

    f1(test1)()

    //匿名函数
    f1(()=>println("dasdsads"))()
    //闭包
    def fi(i:Int): Int => Unit ={
      def f2(j:Int): Unit ={
        println(i*j)
      }
      f2
    }

    fi(2)(3)

    //简化版本:函数柯里化，柯力化必然会用到闭包
    def f3(i:Int)(j:Int):Int = {
      i*j
    }

    println(f3(3)(2))

*/

    def fn7(fn: Int => Unit): Unit = {
      fn(10)
    }

    //当入参只被函数使用一次，可省略入参声明，并且以_替代
    //    var fn  = (i:Int) => {println(i)}
    //    var fn  = i => println(i)
   /* var fn: Int => Unit = println(_)
    fn7(fn)
    fn7(println) //还可以直接把入参省略*/


    /*def eq(s1: String, s2: String): Boolean = {
    s1.equals(s2)
  }*/

    /*implicit class TestEq(s: String) {
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }
    var str1="aaaa"
    var str2 = "bbbb"

    str1.checkEq(str2)(_.equals(_))*/

    def fn8(fn:(Int,Int)=>Int):Int = {
      fn(20,10)
    }

    println(fn8((x,y)=>x+y))
    println(fn8(_-_)) //只要满足于参数在函数中只调用一次，那么就可以用_代替参数名，不论入参个数，并且按照入参顺序来代替


    //捕获异常语法，需要用到模式匹配
    try{
      var a  =10/0
    }catch{
      case ex:ArithmeticException => println("/ zero") //模式匹配类似switch
      case ex:Exception => println("ex")
    } finally{
      println("finally ....")
    }

  }



}
