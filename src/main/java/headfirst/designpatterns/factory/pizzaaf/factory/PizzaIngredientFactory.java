package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.ingredient.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.ingredient.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.ingredient.dough.Dough;
import headfirst.designpatterns.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.ingredient.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
