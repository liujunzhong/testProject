package com.ncu.test.absFactory.pizzastore.abstractfactory

object PizzaStore extends App {

  val orderPizza = new OrderPizza(new BJFactory)
  //val orderPizza = new OrderPizza(new LDFactory)
  println("退出程序....")
}
