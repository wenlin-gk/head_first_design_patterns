package headfirst.designpatterns.adapter.ducks.adapter;

import headfirst.designpatterns.adapter.ducks.adaptee.Turkey;
import headfirst.designpatterns.adapter.ducks.target.Duck;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
