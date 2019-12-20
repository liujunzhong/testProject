package com.ncu.test.factory.pizzastore.use

import com.ncu.test.factory.pizzastore.pizza.{LDCheesePizza, LDPepperPizza, Pizza}


class LDOrderPizza extends OrderPizza {
  override def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new LDCheesePizza
    } else if (t.equals("pepper")) {
      pizza = new LDPepperPizza
    }
    pizza
  }
}
