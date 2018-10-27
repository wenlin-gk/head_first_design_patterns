package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
