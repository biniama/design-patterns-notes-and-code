package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public class Sport extends AbstractCar {
	public Sport(Engine engine, Color color) {
		super(engine, color);
	}

	public Sport(Engine engine) {
		super(engine);
	}

	// Added to demonstrate Decorator Pattern
	@Override
	public int getPrice() {
		return 8000;
	}
}
