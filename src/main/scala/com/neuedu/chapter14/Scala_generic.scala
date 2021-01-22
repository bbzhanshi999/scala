package com.neuedu.chapter14

object Scala_generic {
  def main(args: Array[String]): Unit = {
    def test[T <: Person](t:T): Unit ={
      println(t)
    }
    def test2[T >: Child](t:T):Unit = {
      println(t)
    }
    test(new Person)
    test2("dsadsad")
    val value: BaseBean[String] = new BaseBean[String]("aaaa")
    println(value.username)
    value.username = "10"
    println(value.username)

    //scala不同于java，还提供了协变和逆变操作，必须下面的语句
    val user:BaseBean[User] = new BaseBean[Person]("aaaa")
  }
}

class Person {

}

class User extends Person {

}

class Child extends User{

}

//+协变，-逆变
class BaseBean[-T](var username:String){

}