package com.ncu.test.factory.pizzastore.pizza

abstract class Pizza {

  var name:String = _
  //假定，每种pizza 的准备原材料不同，因此做成抽象的..
  def prepare()
  def cut(): Unit = {
    println(this.name + " cutting ..")
  }
  def bake(): Unit = {
    println(this.name + " baking ..")
  }
  def box(): Unit = {
    println(this.name + " boxing ..")
  }
}
