package com.ncu.test.collection.syntax

/**
 * @Author ljz
 * @Date 2019/12/18 9:14
 * @Version 1.0
 **/
object PatternMatch {
  def main(args: Array[String]): Unit = {
//    val oper = 'x'
//    val n1 = 10
//    val n2 = 20
//    var res = 0
//    oper match {
//      case '+' => res = n1 + n2
//      case '-' => res = n1 - n2
//      case '*' => res = n1 * n2
//      case '/' => res = n1 / n1
//      case _ => println("oper error")
//    }
//    println(res)
    val ch = 'U'
    ch match {
      case '+' => println("ok~~~")
      case mychar => println("ok~~~" + mychar)
      case _ => println("ok~~")
    }


  }
}
