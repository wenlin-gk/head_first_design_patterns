package headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.factory;

import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Quackable;

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
