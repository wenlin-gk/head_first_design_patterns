package headfirst.designpatterns.factory.pizzaaf.factory;

import headfirst.designpatterns.factory.pizzaaf.ingredient.cheese.Cheese;
import headfirst.designpatterns.factory.pizzaaf.ingredient.cheese.MozzarellaCheese;
import headfirst.designpatterns.factory.pizzaaf.ingredient.clams.Clams;
import headfirst.designpatterns.factory.pizzaaf.ingredient.clams.FrozenClams;
import headfirst.designpatterns.factory.pizzaaf.ingredient.dough.Dough;
import headfirst.designpatterns.factory.pizzaaf.ingredient.dough.ThickCrustDough;
import headfirst.designpatterns.factory.pizzaaf.ingredient.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizzaaf.ingredient.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizzaaf.ingredient.sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory.pizzaaf.ingredient.sauce.Sauce;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.BlackOlives;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Eggplant;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Spinach;
import headfirst.designpatterns.factory.pizzaaf.ingredient.veggies.Veggies;

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
