package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.ingredient.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.ingredient.cheese.ReggianoCheese;
import headfirst.designpatterns.factory.pizzaaf.ingredient.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.ingredient.clams.FreshClams;
import headfirst.designpatterns.factory.pizzaaf.ingredient.dough.Dough;
import headfirst.designpatterns.factory.pizzaaf.ingredient.dough.ThinCrustDough;
import headfirst.designpatterns.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.ingredient.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizzaaf.ingredient.sauce.MarinaraSauce;
import headfirst.designpatterns.factory.pizzaaf.ingredient.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Garlic;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Mushroom;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Onion;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.RedPepper;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Veggies;

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
