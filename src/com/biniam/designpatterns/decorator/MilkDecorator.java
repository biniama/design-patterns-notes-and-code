package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public class MilkDecorator extends CondimentDecorator {

	public MilkDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.30;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
}
