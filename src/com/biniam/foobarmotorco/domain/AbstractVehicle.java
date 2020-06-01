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
		return getClass().getSimpleName() + " (" + engine + ", " + getColor() + ", price = " + getPrice() + ')';
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

	// Used in Facade Pattern
	@Override
	public void cleanInterior() {
		System.out.println("Cleaning interior");
	}

	@Override
	public void cleanExterior() {
		System.out.println("Cleaning exterior");
	}

	@Override
	public void polishWindows() {
		System.out.println("Polishing windows");
	}

	@Override
	public void takeForTestDrive() {
		System.out.println("Taking for test drive");
	}
	// END OF Used in Facade Pattern
}
