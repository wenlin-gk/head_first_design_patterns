package combining.adaptor_decorator_factory_composite_observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
