package headfirst.designpatterns.strategy.test;

import headfirst.designpatterns.strategy.Duck;
import headfirst.designpatterns.strategy.MallardDuck;
import headfirst.designpatterns.strategy.ModelDuck;
import headfirst.designpatterns.strategy.behavior.FlyRocketPowered;

public class MiniDuckSimulator1 {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
