package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public class WhipDecorator extends CondimentDecorator {

	public WhipDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.60;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
}
