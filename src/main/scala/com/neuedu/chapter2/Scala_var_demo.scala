package com.neuedu.chapter2

object Scala_var_demo {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = "10"
    var c:String="20"
    val d:Int = 20
    var str = s"a=$a,b=$b,c=$c,d=$d"
    print(str)

    val dog:Dog=new Dog()
    dog.name="aaaa"
    println(dog)
  }
}


class Dog{
  var name:String=null

  override def toString: String ={this.name}
}