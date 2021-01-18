package com.neuedu.chapter10

object Scala_coll_method2 {
  def main(args: Array[String]): Unit = {
    val dogs: List[Dog] = List(new Dog("f"),new Dog("a"), new Dog("a"), new Dog("b"), new Dog("c"))
    println(dogs)
    implicit val dogOrder: Ordering[Dog] = new Ordering[Dog]{
      override def compare(x: Dog, y: Dog): Int = x.name.compareTo(y.name)
    }
    println(dogs.sortBy(d=>d))
  }
}

class Dog(var name:String){
  override def toString: String = "{name = "+ name+"}"

  override def hashCode(): Int = name.hashCode

  override def equals(obj: Any): Boolean = {
    obj match {
      case dog: Dog => dog.name.equals(this.name)
      case _ => false
    }

  }
}