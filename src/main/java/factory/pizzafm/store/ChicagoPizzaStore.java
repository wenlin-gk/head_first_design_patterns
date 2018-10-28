package factory.pizzafm.store;

import factory.pizzafm.pizza.ChicagoStyleCheesePizza;
import factory.pizzafm.pizza.ChicagoStyleClamPizza;
import factory.pizzafm.pizza.ChicagoStylePepperoniPizza;
import factory.pizzafm.pizza.ChicagoStyleVeggiePizza;
import factory.pizzafm.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
