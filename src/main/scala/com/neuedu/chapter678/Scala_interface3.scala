package com.neuedu.chapter678

object Scala_interface3 {
  def main(args: Array[String]): Unit = {
    val mysql = new Mysql
    mysql.insert()
  }
}

trait Operate {
  println("operate")

  def insert (): Unit ={
    println("插入數據")
  }
}

//特质继承其他的特质
//特质重写父特质的方法
trait DB extends Operate {
  println("DB")
  override def insert(): Unit ={
    println("插入數據到数据库")
    super[Operate].insert()
  }
}

trait File extends Operate{
  println("FIle")

  override def insert(): Unit = {
    println("插入数据到文件")
    super.insert()
  }
}
//多特质混入时，代码执行顺序为从左到右，如果有父特质，会优先执行
//多特质混入时，方法的调用顺序从右到左
//特质中super关键字不是只带父特质，指代的是上一级特质，所谓上一级就是从右到左的上一个特质
//如果希望super指向父特质，需要特殊操作super[父特质].
//java的接口可以当成scala中的特质
class Mysql extends File with DB with Serializable{


}