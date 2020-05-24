package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class NYStyleTunaPizza implements Pizza {

	@Override
	public String getName() {
		return "NYStyleTunaPizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing NYStyleTunaPizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking NYStyleTunaPizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting NYStyleTunaPizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing NYStyleTunaPizza");
	}
}
