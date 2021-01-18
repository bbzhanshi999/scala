package com.neuedu.chapter9

object Scala_Transform1 {
  def main(args: Array[String]): Unit = {
    var mysql = new Mysql
    mysql.select()
    //通过隐式转换，来增强类
    implicit class MysqlDelete(mysql:Mysql){
      def delete ():Unit = {
        println("delete data")
      }
    }
    mysql.delete()
  }
}
class Mysql {
  def select():Unit = {

  }
}