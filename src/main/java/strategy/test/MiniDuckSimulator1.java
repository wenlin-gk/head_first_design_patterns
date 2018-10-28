package strategy.test;

import strategy.Duck;
import strategy.MallardDuck;
import strategy.ModelDuck;
import strategy.behavior.FlyRocketPowered;

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
