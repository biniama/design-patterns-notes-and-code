package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public abstract class PizzaStore {

	abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {

		// Just calls createPizza(type) which is implemented by sub classes that call the Factory method based on the pizza type
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
