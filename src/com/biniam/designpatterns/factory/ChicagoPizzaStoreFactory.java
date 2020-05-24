package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class ChicagoPizzaStoreFactory extends PizzaStore {

	@Override
	Pizza createPizza(String type) {

		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("tuna")) {
			return new ChicagoStyleTunaPizza();
		} else {
			throw new RuntimeException("No such pizza in Chicago!");
		}
	}
}
