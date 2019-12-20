package com.ncu.test.absFactory.pizzastore.abstractfactory

import com.ncu.test.absFactory.pizzastore.pizza.{LDCheesePizza, LDPepperPizza, Pizza}


class LDFactory extends AbsFactory {
  override def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new LDCheesePizza
    } else if (t.equals("pepper")) {
      pizza = new LDPepperPizza
    }
    return pizza
  }
}
