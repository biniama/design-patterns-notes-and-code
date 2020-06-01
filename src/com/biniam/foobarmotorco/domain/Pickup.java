package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public class Pickup extends AbstractVehicle {
	public Pickup(Engine engine, Color color) {
		super(engine, color);
	}

	public Pickup(Engine engine) {
		super(engine);
	}

	// Added to demonstrate Decorator Pattern
	@Override
	public int getPrice() {
		return 9000;
	}
}
