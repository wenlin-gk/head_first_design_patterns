package headfirst.designpatterns.combining.adaptor_decorator_factory_composite_observer;

public class Quackologist implements Observer {
 
	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
