package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 0.99;
	}
}
