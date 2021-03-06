package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public class Coupe extends AbstractCar {
	public Coupe(Engine engine, Color color) {
		super(engine, color);
	}

	public Coupe(Engine engine) {
		super(engine);
	}

	// Added to demonstrate Decorator Pattern
	@Override
	public int getPrice() {
		return 7000;
	}
}
