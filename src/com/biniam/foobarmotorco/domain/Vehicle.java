package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
// extends Cloneable is Used in Prototype Pattern
public interface Vehicle extends Cloneable {

	public enum Color {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW }

	Engine getEngine();

	Color getColor();

	void paint(Color color);

	// Added to demonstrate Decorator Pattern
	int getPrice();

	// Used in Prototype Pattern
	// An approach to improve instantiation time is to utilize Java's clone() method by extending Cloneable class.
	// The Object class in Java defines clone() as protected.
	public Object clone();

	// Used in Facade Pattern
	void cleanInterior();
	void cleanExterior();
	void polishWindows();
	void takeForTestDrive();
}
