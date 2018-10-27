package headfirst.designpatterns.factory.pizzafm.store;

import headfirst.designpatterns.factory.pizzafm.pizza.NYStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStyleClamPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStyleVeggiePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
