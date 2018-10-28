package factory.pizzas;

import factory.pizzas.pizza.CheesePizza;
import factory.pizzas.pizza.ClamPizza;
import factory.pizzas.pizza.PepperoniPizza;
import factory.pizzas.pizza.Pizza;
import factory.pizzas.pizza.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
