package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class NYPizzaStoreFactory extends PizzaStore {

	@Override
	Pizza createPizza(String type) {

		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("tuna")) {
			return new NYStyleTunaPizza();
		} else {
			throw new RuntimeException("No such pizza in NY!");
		}
	}
}
