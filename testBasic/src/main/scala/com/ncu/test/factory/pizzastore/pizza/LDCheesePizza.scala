package com.ncu.test.factory.pizzastore.pizza

class LDCheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "伦敦的奶酪pizza"
    println(this.name + " preparing..")
  }
}
