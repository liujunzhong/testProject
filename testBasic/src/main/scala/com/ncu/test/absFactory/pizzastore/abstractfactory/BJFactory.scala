package com.ncu.test.absFactory.pizzastore.abstractfactory

import com.ncu.test.absFactory.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

class BJFactory extends AbsFactory {
  override def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new BJCheesePizza
    } else if (t.equals("pepper")) {
      pizza = new BJPepperPizza
    }
    return pizza
  }
}
