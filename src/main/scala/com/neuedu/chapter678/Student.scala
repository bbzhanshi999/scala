package com.neuedu.chapter678


//伴生类 (成员)
class Student {
  private val sname = "zhangsan"
}
//伴生对象 （静态）
//创建伴生类对象，单例模式，需要提供特殊的方法，实现相应的功能
object Student{
  //apply方法用于创建伴生类对象，可以有参数可以有多个
  def apply(): Student = new Student()

  def apply(a:Int):Student = new Student
  
  def test() ={
    val stu  =new Student
    println(stu.sname) //伴生对象可以方位伴生类的私有属性，这是private特殊的地方
  }
}
