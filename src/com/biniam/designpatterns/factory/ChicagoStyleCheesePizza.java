package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class ChicagoStyleCheesePizza implements Pizza {

	@Override
	public String getName() {
		return "ChicagoStyleCheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing ChicagoStyleCheesePizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking ChicagoStyleCheesePizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting ChicagoStyleCheesePizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing ChicagoStyleCheesePizza");
	}
}
