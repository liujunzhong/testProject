package com.ncu.test.absFactory.pizzastore.pizza

class GreekPizza extends Pizza{
  override def prepare(): Unit = {
    this.name = "希腊pizza"
    println(this.name + " preparing..")
  }
}
