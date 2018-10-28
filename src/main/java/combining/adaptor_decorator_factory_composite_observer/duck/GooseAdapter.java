package combining.adaptor_decorator_factory_composite_observer.duck;

import combining.adaptor_decorator_factory_composite_observer.Observable;
import combining.adaptor_decorator_factory_composite_observer.Observer;
import combining.adaptor_decorator_factory_composite_observer.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
