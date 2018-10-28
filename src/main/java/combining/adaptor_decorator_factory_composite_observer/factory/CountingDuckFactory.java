package combining.adaptor_decorator_factory_composite_observer.factory;

import combining.adaptor_decorator_factory_composite_observer.QuackCounter;
import combining.adaptor_decorator_factory_composite_observer.Quackable;
import combining.adaptor_decorator_factory_composite_observer.duck.DuckCall;
import combining.adaptor_decorator_factory_composite_observer.duck.MallardDuck;
import combining.adaptor_decorator_factory_composite_observer.duck.RedheadDuck;
import combining.adaptor_decorator_factory_composite_observer.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
