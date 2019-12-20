package com.ncu.test.absFactory.pizzastore.pizza

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + " preparing..")
  }
}
