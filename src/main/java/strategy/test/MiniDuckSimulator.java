package strategy.test;

import strategy.DecoyDuck;
import strategy.Duck;
import strategy.MallardDuck;
import strategy.ModelDuck;
import strategy.RubberDuck;
import strategy.behavior.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck	 model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
