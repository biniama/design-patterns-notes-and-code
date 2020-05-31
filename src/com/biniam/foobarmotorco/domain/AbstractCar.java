package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractCar extends AbstractVehicle {

	public AbstractCar(Engine engine, Color color) {
		super(engine, color);
	}

	public AbstractCar(Engine engine) {
		super(engine);
	}
}
