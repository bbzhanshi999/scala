package com.neuedu.chapter678


/*package  p1 {
  package p2 {
    class UserP2{
      var username = "zhangsan"
      private var password = "1234"
      protected  var email = "xx@,com"
      private[p3] var address = "aaaa"
    }
  }

  package  p3 {

    import com.neuedu.chapter678.p1.p2.UserP2

    class Demo extends UserP2 {
      def main(args: Array[String]): Unit = {
        val user = new UserP2
        println(user.address)
        println(user.email)
        println(user.address)
      }
    }
  }
}*/

object Scala_access {

  def main(args: Array[String]): Unit = {
    val a  =new A()
//    a.clone()

  }
}
//scala中也有四种访问权限：public protected  default（package） private，但是权限与java不同，更加清晰
// 1 public :默认的访问权限，没有关键字
// 2 proctected:访问权限只能是子类访问，同包访问不了
// 3. private ：私有访问权限，只能当前类访问
// 4. default package:包访问权限，采用特殊语法规则，采用private代替：private[包名]
class A {

}

protected  class B {

}


/*
private class C {
  private[p2] var str = "aaa"
}
*/

