package headfirst.designpatterns.factory.pizzafm;

import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStyleClamPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStyleVeggiePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStyleClamPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.NYStyleVeggiePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.Pizza;

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
