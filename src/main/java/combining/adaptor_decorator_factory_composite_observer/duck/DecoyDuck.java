package combining.adaptor_decorator_factory_composite_observer.duck;

import combining.adaptor_decorator_factory_composite_observer.Observable;
import combining.adaptor_decorator_factory_composite_observer.Observer;
import combining.adaptor_decorator_factory_composite_observer.Quackable;

public class DecoyDuck implements Quackable {
	Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
