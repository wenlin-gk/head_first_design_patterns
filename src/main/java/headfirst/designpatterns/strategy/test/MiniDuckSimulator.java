package headfirst.designpatterns.strategy.test;

import headfirst.designpatterns.strategy.DecoyDuck;
import headfirst.designpatterns.strategy.Duck;
import headfirst.designpatterns.strategy.MallardDuck;
import headfirst.designpatterns.strategy.ModelDuck;
import headfirst.designpatterns.strategy.RubberDuck;
import headfirst.designpatterns.strategy.behavior.FlyRocketPowered;

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
