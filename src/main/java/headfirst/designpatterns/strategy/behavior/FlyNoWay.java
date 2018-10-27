package headfirst.designpatterns.strategy.behavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
