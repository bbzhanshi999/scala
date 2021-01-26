package com.neuedu.datastructure

//数组实现環形队列
object circle_queue_demo {


  def main(args: Array[String]): Unit = {
    val q: MyCQueue[Int] = MyCQueue[Int](1, 2, 3, 4, 5)
    //    println(q.peek.get)

    /*println(q.get().get)
    println(q.get().get)
    println(q.get().get)
    println(q.get().get)
    q.add(3)*/
//    println(q.get().get)
    q.get().get
    q.get().get
    q.show
    q.add(10)
    q.add(11)
    q.show
    println(q.get().get)
    q.show
    q.add(12)
    q.show
  }
}


class MyCQueue[T: Manifest](val maxSize: Int = 10) {
  var front: Int = 0 // 记录第一条数据的位置
  var rear: Int = 0 //指向队列最后一个元素的下一个位置
  val arr: Array[T] = new Array[T](maxSize)


  private def isFull: Boolean = {
    (rear + 1) % maxSize == front
  }

  private def isEmpty: Boolean = {
    rear == front
  }

  def this(ts: T*) = {
    this(ts.length+1)
    ts.foreach(add)
  }

  def peek: Option[T] = {
    if (isEmpty)
      None
    else {
      Some(arr(front))
    }
  }

  def add(t: T): Any = {
    if (isFull) {
      throw new Exception("out of range")
    } else {
      arr(rear) = t
      rear = (rear + 1) % maxSize
    }
  }

  def get(): Option[T] = {
    if (isEmpty)
      None
    else {
      val temp: Option[T] = Some(arr(front))
      front = (front + 1) % maxSize
      temp
    }
  }

  def show {
    println("所有有效数据：")
    for (i <- front until size+front) {
      println(arr(i % maxSize))
    }
  }

  //获取有效数据的长度
  def size: Int = {
    (rear + maxSize - front) % maxSize
  }
}

object MyCQueue {
  def apply[E: Manifest] = new MyCQueue[E]()

  def apply[E: Manifest](ms: Int) = new MyCQueue[E](ms)

  def apply[E: Manifest](ts: E*) = new MyCQueue[E](ts: _*)
}
