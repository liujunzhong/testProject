package com.ncu.test.collection

/**
 * @Author ljz
 * @Date 2019/12/13 11:18
 * @Version 1.0
 **/
object YieldTest {
  def main(args: Array[String]): Unit = {
    var res = for (i <- 1 to 10) yield i
    println(res)
    var res2 = for (i <- 1 until 10) yield {
      if (i % 2 == 0){
        i
      }else{
        "奇数"
      }
    }
    println(res2)
  }
}
