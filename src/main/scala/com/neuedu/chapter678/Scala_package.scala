package com.neuedu.chapter678



//scala中的包声明方式和java一致，但是有其他使用方式
//1: 一个源码文件中，允许多次声明,多次声明实际就是将一个完整的包名拆开来写
//  源码中类所在的位置不需要和包路径相同，编译后的字节码文件需要和包路径相同
//2: scala中所有的语法都能可以进行嵌套，包里嵌套包，如下代码
//含义是只有在包里面的代码才属于这个包,好处就是一个源码文件可以写多个包中的源码
//3. scala中，子包可以直接访问父包中的类，不需要引入，
//4 scala中，可以声明的只能是类和伴生对象
//5 为了弥补java中包的不足（无法声明函数或者是属性），使用了包对象的概念：把包当成对象,其中可以声明属性和方法
//5.1. 在包中直接写方法，或者定义变量，是不行的==>使用包对象的技术来解决
//5.2. package object one 表示创建一个包对象 one, 他是 com.shufang.one 这个包对应的包对象
//5.3. 每一个包都可以有一个包对象
//5.4. 包对象的名字需要和该包下的子包一样
//5.5. 在包对象中可以定义变量，方法
//5.6. 在包对象中定义的变量和方法，就可以在对应的包中的任何类中访问、使用
//5.7. 在底层这个包对象会生成两个类 package.class 和 package$.class

package test{
  package object test {
    val test = "123"

    def testFn = "321"
  }


  class Emp{

  }
  package test1 {

    object Scala_sub_pack {
      def main(args: Array[String]): Unit = {
        val Emp = new Emp() //子包的作用域覆盖父包，所以不需要导入
      }
    }
  }
}

object Scala_package {
  def main(args: Array[String]): Unit = {
    println("zz")
//    val emp = new Emp() //代码不会报错
  }
}
/*
class Emp{

}*/
