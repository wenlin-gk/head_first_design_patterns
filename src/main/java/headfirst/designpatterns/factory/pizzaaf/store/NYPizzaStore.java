package headfirst.designpatterns.factory.pizzaaf.store;

import headfirst.designpatterns.factory.pizzaaf.factory.NYPizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.factory.PizzaIngredientFactory;
import headfirst.designpatterns.factory.pizzaaf.pizza.CheesePizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.ClamPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.PepperoniPizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.Pizza;
import headfirst.designpatterns.factory.pizzaaf.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
