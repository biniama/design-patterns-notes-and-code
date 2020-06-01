package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public class BoxVan extends AbstractVan {
	public BoxVan(Engine engine, Color color) {
		super(engine, color);
	}

	public BoxVan(Engine engine) {
		super(engine);
	}

	// Added to demonstrate Decorator Pattern
	@Override
	public int getPrice() {
		return 10000;
	}
}
