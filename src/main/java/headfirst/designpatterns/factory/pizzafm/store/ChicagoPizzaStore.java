package headfirst.designpatterns.factory.pizzafm.store;

import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStyleCheesePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStyleClamPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStylePepperoniPizza;
import headfirst.designpatterns.factory.pizzafm.pizza.ChicagoStyleVeggiePizza;
import headfirst.designpatterns.factory.pizzafm.pizza.Pizza;

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
