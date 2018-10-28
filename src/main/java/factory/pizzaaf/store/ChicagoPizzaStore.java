package factory.pizzaaf.store;

import factory.pizzaaf.factory.ChicagoPizzaIngredientFactory;
import factory.pizzaaf.factory.PizzaIngredientFactory;
import factory.pizzaaf.pizza.CheesePizza;
import factory.pizzaaf.pizza.ClamPizza;
import factory.pizzaaf.pizza.PepperoniPizza;
import factory.pizzaaf.pizza.Pizza;
import factory.pizzaaf.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
