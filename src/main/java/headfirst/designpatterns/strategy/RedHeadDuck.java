package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.FlyWithWings;
import headfirst.designpatterns.strategy.behavior.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
