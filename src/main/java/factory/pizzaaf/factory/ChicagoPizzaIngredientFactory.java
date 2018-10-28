package factory.pizzaaf.factory;

import factory.pizzaaf.ingredient.cheese.Cheese;
import factory.pizzaaf.ingredient.cheese.MozzarellaCheese;
import factory.pizzaaf.ingredient.clams.Clams;
import factory.pizzaaf.ingredient.clams.FrozenClams;
import factory.pizzaaf.ingredient.dough.Dough;
import factory.pizzaaf.ingredient.dough.ThickCrustDough;
import factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import factory.pizzaaf.ingredient.pepperoni.SlicedPepperoni;
import factory.pizzaaf.ingredient.sauce.PlumTomatoSauce;
import factory.pizzaaf.ingredient.sauce.Sauce;
import factory.pizzaaf.ingredient.veggies.BlackOlives;
import factory.pizzaaf.ingredient.veggies.Eggplant;
import factory.pizzaaf.ingredient.veggies.Spinach;
import factory.pizzaaf.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
