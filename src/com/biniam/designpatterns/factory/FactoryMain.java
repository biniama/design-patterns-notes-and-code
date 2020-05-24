package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class FactoryMain {

	public static void main(String[] args) {

		// Factory Method Pattern defers object instantiation to subclasses.
		PizzaStore nyPizzaStore = new NYPizzaStoreFactory();

		Pizza cheesePizzaOrderedInTheNYStore = nyPizzaStore.orderPizza("cheese");

		System.out.printf("Pizza %s is ready for pickup\n", cheesePizzaOrderedInTheNYStore.getName());

		// Another example
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStoreFactory();
		Pizza tunaPizzaOrderedInChicagoStore = chicagoPizzaStore.orderPizza("tuna");
		System.out.printf("Pizza %s is ready for pickup\n", tunaPizzaOrderedInChicagoStore.getName());
	}
}
