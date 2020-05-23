package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public class BeverageMain {

	public static void main(String[] args) {
		// Get me a dark roast coffee with milk and double whip
		Beverage beverage = new DarkRoastCoffee();
		beverage = new MilkDecorator(beverage);
		beverage = new WhipDecorator(beverage);
		beverage = new WhipDecorator(beverage);

		System.out.println("You ordered " + beverage.getDescription() + " and it costs " + beverage.cost());
	}
}
