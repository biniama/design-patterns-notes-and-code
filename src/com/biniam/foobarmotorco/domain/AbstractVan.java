package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractVan extends AbstractVehicle {

	public AbstractVan(Engine engine, Color color) {
		super(engine, color);
	}

	public AbstractVan(Engine engine) {
		super(engine);
	}
}
