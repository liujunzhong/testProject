package com.ncu.test.absFactory.pizzastore.abstractfactory

import com.ncu.test.absFactory.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

class OrderPizza {

  var absFactory :AbsFactory = _

  def this(absFactory: AbsFactory) {
    this
    breakable {
      var orderType: String = null
      var pizza: Pizza = null
      do {
        println("请输入pizza的类型 ,使用抽象工厂模式...")
        orderType = StdIn.readLine()
        //使用简单工厂模式来创建对象.
        pizza = absFactory.createPizza(orderType)
        if (pizza == null) {
          break()
        }
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
      } while (true)
    }
  }

}

