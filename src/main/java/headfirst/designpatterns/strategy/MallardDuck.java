package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyWithWings;
import headfirst.designpatterns.strategy.behavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
