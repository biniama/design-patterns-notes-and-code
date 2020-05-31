package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public interface Vehicle {

	public enum Color {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW }

	Engine getEngine();

	Color getColor();

	void paint(Color color);
}
