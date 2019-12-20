package com.ncu.test.factory.pizzastore.use

import com.ncu.test.factory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

abstract class OrderPizza {


  breakable {
    var orderType: String = null
    var pizza: Pizza = null
    do {
      println("请输入pizza的类型 ,使用工厂方法模式...")
      orderType = StdIn.readLine()
      //使用简单工厂模式来创建对象.
      pizza = createPizza(orderType)
      if (pizza == null) {
        break()
      }
      pizza.prepare()
      pizza.bake()
      pizza.cut()
      pizza.box()
    } while (true)
  }
  //抽象方法
  def createPizza(t: String): Pizza

}

