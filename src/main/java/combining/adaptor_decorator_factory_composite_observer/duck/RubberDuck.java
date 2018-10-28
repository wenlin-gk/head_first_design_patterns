package combining.adaptor_decorator_factory_composite_observer.duck;

import combining.adaptor_decorator_factory_composite_observer.Observable;
import combining.adaptor_decorator_factory_composite_observer.Observer;
import combining.adaptor_decorator_factory_composite_observer.Quackable;

public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
