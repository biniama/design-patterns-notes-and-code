package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public class DarkRoastCoffee extends Beverage {

	public DarkRoastCoffee() {
		description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return 1.00;
	}
}
