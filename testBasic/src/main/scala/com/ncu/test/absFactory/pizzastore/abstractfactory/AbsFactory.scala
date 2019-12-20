package com.ncu.test.absFactory.pizzastore.abstractfactory

import com.ncu.test.absFactory.pizzastore.pizza.Pizza

//声明一个特质，类似java的接口
trait AbsFactory {
  //一个抽象方法
  def  createPizza(t : String ): Pizza
}
