package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public class Saloon extends AbstractCar {

	public Saloon(Engine engine, Color color) {
		super(engine, color);
	}

	public Saloon(Engine engine) {
		super(engine);
	}

	// Added to demonstrate Decorator Pattern
	@Override
	public int getPrice() {
		return 6000;
	}
}
