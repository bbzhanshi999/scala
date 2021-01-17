package com.neuedu.chapter678

//import取别名
import java.util.{HashMap => JavaHashMap}

/*package  java {
  package  util {

    class HashMap{

    }

    object Scala_import1{
      def main(args: Array[String]): Unit = {
        //scala中如有必要，比如你的包名与java原始类库有部分重名，那么就可以使用绝对路径_root_
        val map = new _root_.java.util.HashMap() //导入的是自己的hashMap要想导入java的，需要使用_root_
        println(map.getClass)

        val map2 = new JavaHashMap
        println(map2.getClass)
      }
    }

  }
}*/

object Scala_import1{
  def main(args: Array[String]): Unit = {
    //scala中如有必要，比如你的包名与java原始类库有部分重名，那么就可以使用绝对路径_root_
    val map = new _root_.java.util.HashMap() //导入的是自己的hashMap要想导入java的，需要使用_root_
    println(map.getClass)

    val map2 = new JavaHashMap
    println(map2.getClass)
  }
}

