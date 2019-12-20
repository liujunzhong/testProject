package com.ncu.test.factory.pizzastore.pizza

class BJCheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京的奶酪pizza"
    println(this.name + " preparing..")
  }
}
