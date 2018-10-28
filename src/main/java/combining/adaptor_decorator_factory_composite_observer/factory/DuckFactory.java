package combining.adaptor_decorator_factory_composite_observer.factory;

import combining.adaptor_decorator_factory_composite_observer.Quackable;
import combining.adaptor_decorator_factory_composite_observer.duck.DuckCall;
import combining.adaptor_decorator_factory_composite_observer.duck.MallardDuck;
import combining.adaptor_decorator_factory_composite_observer.duck.RedheadDuck;
import combining.adaptor_decorator_factory_composite_observer.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
