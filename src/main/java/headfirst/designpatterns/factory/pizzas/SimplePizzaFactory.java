package headfirst.designpatterns.factory.pizzas;

import headfirst.designpatterns.factory.pizzas.pizza.CheesePizza;
import headfirst.designpatterns.factory.pizzas.pizza.ClamPizza;
import headfirst.designpatterns.factory.pizzas.pizza.PepperoniPizza;
import headfirst.designpatterns.factory.pizzas.pizza.Pizza;
import headfirst.designpatterns.factory.pizzas.pizza.VeggiePizza;

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
