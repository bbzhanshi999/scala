package com.neuedu.chapter678



import com.neuedu.chapter678.test.Emp

import scala.beans.BeanProperty

object Scala_obj {

  def main(args: Array[String]): Unit = {

    //创建类的对象
    val user:User = new User();
    //调用对象的属性和方法

    val emp:Emp = new Emp
    user.username = "zhangsan"
    //等价于
    user.username_=("aaaa") //这行代码等价于上面的=赋值，具体参考字节码
    println(user.username)

    user.setAddress("aaaa")
    println(user.getAddress)
  }
}


//声明类

class User{
  //类的主体内容
  //声明属性
  //scla中给类的声明属性，都是私有的，但是提供了公共的setter和getter方法，当然这是有scala动态编译器底层完成的
  var username :String = _     //_在这里类似java的默认初始化值

  //在scala中如果显示给属性声明private修饰符，会导致getter和setter也是私有的
  private var age:Int =  _

  val email:String = "" //如果声明用val，那么底层字节码只提供getter方法，并且属性是final修饰的

  def login():Boolean  ={
    true
  }
  //@BeanProperty注解是为了和java统一，使得scala中的属性有类似java的get set方法
  @BeanProperty var  address:String = _
}