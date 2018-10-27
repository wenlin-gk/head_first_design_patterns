package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
