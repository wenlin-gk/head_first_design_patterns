package factory.pizzaaf.factory;

import factory.pizzaaf.ingredient.cheese.Cheese;
import factory.pizzaaf.ingredient.clams.Clams;
import factory.pizzaaf.ingredient.dough.Dough;
import factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import factory.pizzaaf.ingredient.sauce.Sauce;
import factory.pizzaaf.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
