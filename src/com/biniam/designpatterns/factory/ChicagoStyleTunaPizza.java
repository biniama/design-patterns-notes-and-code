package com.biniam.designpatterns.factory;

/**
 * @author Biniam Asnake
 */
public class ChicagoStyleTunaPizza implements Pizza {

	@Override
	public String getName() {
		return "ChicagoStyleTunaPizza";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing ChicagoStyleTunaPizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking ChicagoStyleTunaPizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting ChicagoStyleTunaPizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing ChicagoStyleTunaPizza");
	}
}
