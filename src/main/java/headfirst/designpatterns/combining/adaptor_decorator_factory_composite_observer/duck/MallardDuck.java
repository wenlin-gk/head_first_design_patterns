package headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.duck;

import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Observable;
import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Observer;
import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Quackable;

public class MallardDuck implements Quackable {
	Observable observable;
 
	public MallardDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
 
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Mallard Duck";
	}
}
