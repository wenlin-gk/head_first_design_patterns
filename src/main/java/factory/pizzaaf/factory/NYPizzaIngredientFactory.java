package factory.pizzaaf.factory;

import factory.pizzaaf.ingredient.cheese.Cheese;
import factory.pizzaaf.ingredient.cheese.ReggianoCheese;
import factory.pizzaaf.ingredient.clams.Clams;
import factory.pizzaaf.ingredient.clams.FreshClams;
import factory.pizzaaf.ingredient.dough.Dough;
import factory.pizzaaf.ingredient.dough.ThinCrustDough;
import factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import factory.pizzaaf.ingredient.pepperoni.SlicedPepperoni;
import factory.pizzaaf.ingredient.sauce.MarinaraSauce;
import factory.pizzaaf.ingredient.sauce.Sauce;
import factory.pizzaaf.ingredient.veggies.Garlic;
import factory.pizzaaf.ingredient.veggies.Mushroom;
import factory.pizzaaf.ingredient.veggies.Onion;
import factory.pizzaaf.ingredient.veggies.RedPepper;
import factory.pizzaaf.ingredient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
