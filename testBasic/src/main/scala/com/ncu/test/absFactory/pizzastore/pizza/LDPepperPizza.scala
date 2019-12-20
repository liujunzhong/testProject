package com.ncu.test.absFactory.pizzastore.pizza

class LDPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "伦敦的胡椒pizza"
    println(this.name + " preparing..")
  }
}
