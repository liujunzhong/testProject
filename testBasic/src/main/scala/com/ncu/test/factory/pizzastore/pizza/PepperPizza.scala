package com.ncu.test.factory.pizzastore.pizza

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + " preparing..")
  }
}
