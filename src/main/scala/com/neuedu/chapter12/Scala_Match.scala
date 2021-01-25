package com.neuedu.chapter12

object Scala_Match {
  def main(args: Array[String]): Unit = {
    /*  val oper = "/"
      val n1 = 20.1
      val n2 = 10
      var res: Double = 0
      oper match {
        case "*" => res = n1 * n2
        case "+" => res = n1 + n2
        case "_" => res = n1 - n2
        case "/" => res = n1 / n2
        case _ => res = n1 + n2
      }
      println(s"res=$res,res type = ${res.getClass}")

      //    _类似java中的default，但区别在于_可以有多个，更准确的说法，下划线相当于通配符
      // match case可以有返回值
      var oper2 = "c"
      var a = oper2 match {
        case _ => 40
        case "a" => 10
        case "b" => 20
        case _ => 50
        case _ => 60
        case _ if oper2.equals("c") => 30
      }
      println(a)

      var oper3: Any = Map(1->"dsadsa")
      //模式匹配类型
      var result: Any = oper3 match {
        case a: Int => a
        case b:Map[String,Int] =>"大萨达撒多哇多"  //类型匹配中泛型不起作用
        case _ =>List(1,23,4)
      }
      println(result)
      */

    //匹配数组
    /* var arr = Array(Array(0),Array(0,1),Array(0,1,0),Array(1,1,0))
     for(subarr<-arr){
       var result2 = subarr match {
         case Array(0)=>"0"
         case Array(x,y)=>x+"="+y
         case Array(0,_*)=>"以0开头数组,"
         case _ => "nothing"
       }
       println(result2)
     }*/

    /* var list = List(List(0),List(0,1),List(0,1,0),List(1,1,0))
     for(subList<-list){
       var result2 = subList match {
         case 0 :: Nil =>"0"
         case x::y::Nil=>x+"="+y
         case 0:: tail =>"以0开头list,"
         case _ => "nothing"
       }
       println(result2)
     }*/

    //匹配元祖
  /*  for (pair <- Array((0, 1), (1, 0), (2, 1), (1, 0.2))) {
      val result = pair match {
        case (0, _) => "0 ..." //_代表任意参数
        case (y, 0) => y
        case (a, b) => (b, a)
        case _ => "other"
      }
      println(result)
    }*/
    // 对象匹配
    object Square{
      //upapply方法会反向
      def unapply(z: Double): Option[Double] = Some(math.sqrt(z))

      def apply(z:Double): Double = z*z
    }

    val number = 81.0
    number match {
      case Square(n)=>println(n)
      case _ =>println("nothing")
    }
    
  }
}
