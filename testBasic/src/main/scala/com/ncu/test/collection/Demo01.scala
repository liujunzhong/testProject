package com.ncu.test.collection

import scala.collection.{immutable, mutable}
import scala.collection.mutable.ListBuffer


/**
 * @Author ljz
 * @Date 2019/12/16 10:34
 * @Version 1.0
 **/
object Demo01 {
  def main(args: Array[String]): Unit = {
//    val list = List(1,2,3,"abc");
//    var list2 = 4::5::6::list::Nil;
//    println(list2)

//    val listbuffer = new ListBuffer[Int]
//    listbuffer += 1
//    listbuffer +=2
//    println(listbuffer)

//    val listBuffer2 = ListBuffer(1,2,3)
//    listBuffer2 += 4
//    println(listBuffer2)

//    val queue = mutable.Queue(1,2,3)
//    println(queue.dequeue())
//    println(queue.dequeue())
//    println(queue.head)

//    val map = Map("zhangsan"->12,"lisi"->14,"wangwu"->17)
//    println(map)
//    val map2 = mutable.Map("xiaoming"->11,"xiaohong"->14,"xiaojing"->18)
//    map2 +=("aaa"->10)
//    map2("aaa") = 20
//    map2 +=("aaa"->11)
//    println(map2)

//    val map = Map("a"->1,"b"->2,"c"->3,"d"->4)
//    for ((k,v)<-map){
//      println("k: " + k + "v: " + v)
//    }
//    for (tuple <- map){
//      println("key: " + tuple._1 + " value " + tuple._2)
//    }

//    val test: (Int => Nothing) => immutable.IndexedSeq[Nothing] = (1 to 10).map(_)
//    println(test)

    def numsForm(n:Int):Stream[Int]=n#::numsForm(n + 1)
    val stream1 = numsForm(1)
    println(stream1.head)
    println(stream1.tail)
    println(stream1)


  }

}
