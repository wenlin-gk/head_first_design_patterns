package decorator.starbuzz.condiment;

import decorator.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
