package com.ncu.test.factory.pizzastore.pizza

class BJPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京的胡椒pizza"
    println(this.name + " preparing..")
  }
}
