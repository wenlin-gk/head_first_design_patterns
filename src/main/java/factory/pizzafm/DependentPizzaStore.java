package factory.pizzafm;

import factory.pizzafm.pizza.ChicagoStyleCheesePizza;
import factory.pizzafm.pizza.ChicagoStyleClamPizza;
import factory.pizzafm.pizza.ChicagoStylePepperoniPizza;
import factory.pizzafm.pizza.ChicagoStyleVeggiePizza;
import factory.pizzafm.pizza.NYStyleCheesePizza;
import factory.pizzafm.pizza.NYStyleClamPizza;
import factory.pizzafm.pizza.NYStylePepperoniPizza;
import factory.pizzafm.pizza.NYStyleVeggiePizza;
import factory.pizzafm.pizza.Pizza;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
