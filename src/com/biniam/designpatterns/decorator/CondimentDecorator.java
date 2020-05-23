package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	// override the getDescription() and force subclasses to override it.
	@Override
	public abstract String getDescription();
}