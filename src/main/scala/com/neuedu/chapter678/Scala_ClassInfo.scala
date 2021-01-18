package com.neuedu.chapter678

object Scala_ClassInfo {
  def main(args: Array[String]): Unit = {
    //TODO scala如果想要获取类的信息，需要特殊的方法
    //classOf能直接使用，因为scala.Predef伴生对昂默认导入到环境中
    val userClass:Class[User19] = classOf[User19]
    //给类其别名,使用type关键字起别名
    type XXXX = User19
    val xxxx = new XXXX

    var user:Object = new User19
    //避免强制装换，使用实例类型判断
    var bool = user.isInstanceOf[User19]
    if(bool){
      val user19:User19 = user.asInstanceOf[User19]
    }

  }
}
class User19{

}

