package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class NYStyleCheesePizza implements Pizza {

	@Override
	public String getName() {
		return "NYStyleCheesePizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing NYStyleCheesePizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking NYStyleCheesePizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting NYStyleCheesePizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing NYStyleCheesePizza");
	}
}
