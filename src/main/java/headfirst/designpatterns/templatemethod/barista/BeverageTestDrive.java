package headfirst.designpatterns.templatemethod.barista;

import headfirst.designpatterns.templatemethod.barista.beverage.Coffee;
import headfirst.designpatterns.templatemethod.barista.beverage.Tea;
import headfirst.designpatterns.templatemethod.barista.beverage_with_hook.CoffeeWithHook;
import headfirst.designpatterns.templatemethod.barista.beverage_with_hook.TeaWithHook;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
