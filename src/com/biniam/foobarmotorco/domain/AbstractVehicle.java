package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractVehicle implements Vehicle {

	private Engine engine;

	private Color color;

	public AbstractVehicle(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;
	}

	public AbstractVehicle(Engine engine) {
		this(engine, Color.UNPAINTED);
	}

	@Override
	public Engine getEngine() {
		return engine;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void paint(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " {" + "engine=" + engine + ", color=" + color + '}';
	}

	// Used in Prototype Pattern
	@Override
	public Object clone() {
		Object obj =  null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {
			// Should not happen
			e.printStackTrace();
		}
		return obj;
	}
}
