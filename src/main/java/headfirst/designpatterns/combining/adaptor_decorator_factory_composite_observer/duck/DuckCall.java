package headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.duck;

import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Observable;
import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Observer;
import headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer.Quackable;

public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
