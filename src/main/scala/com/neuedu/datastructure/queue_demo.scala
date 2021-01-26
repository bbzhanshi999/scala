package com.neuedu.datastructure


//数组实现队列
object queue_demo {


  def main(args: Array[String]): Unit = {
    val q : MyQueue[Int] = MyQueue[Int](1, 2, 3, 4, 5)
//    println(q.peek.get)

    println(q.get().get)
    println(q.get().get)
    println(q.get().get)
    println(q.get().get)
    q.add(3)
  }
}


class MyQueue[T: Manifest](val maxSize:Int=10){
  var front:Int = -1 // 记录第一条数据的位置，因为要fifo
  var rear:Int = -1 //记录最后一条数据的位置
  val arr:Array[T] = new Array[T](maxSize)

  def apply(maxSize:Int)=new MyCQueue[T](maxSize)

  private def isFull:Boolean = {
    rear== maxSize-1
  }

  private def isEmpty:Boolean = {
    rear==front
  }

  def this(ts:T*) = {
    this(ts.length)
    ts.foreach(add)
  }

  def peek:Option[T] = {
    if(isEmpty)
      None
    else{
      Some(arr(front+1))
    }
  }

  def add(t:T):Any = {
    if(isFull){
      throw new Exception("out of range")
    }else{
      arr(rear+1) = t
      rear+=1
    }
  }

  def get():Option[T] = {
    if(isEmpty)
      None
    else {
      front+=1
      Some(arr(front))
    }
  }

  def show {
    arr.slice(front+1,rear+1).foreach(println)
  }

}

object MyQueue{
  def apply[E:Manifest]=new MyQueue[E]()
  def apply[E:Manifest](ms:Int)=new MyQueue[E](ms)
  def apply[E:Manifest](ts:E*)= new MyQueue[E](ts:_*)
}
