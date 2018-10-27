package headfirst.designpatterns.decorator.starbuzz.condiment;

import headfirst.designpatterns.decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
