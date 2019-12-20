package com.ncu.test.absFactory.pizzastore.pizza

class CheesePizza extends Pizza{
  override def prepare(): Unit = {
    this.name = "奶酪pizza"
    println(this.name + " preparing..")
  }
}
