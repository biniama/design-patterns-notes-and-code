package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public interface Engine {

	// Flyweight pattern - methods having intrinsic (shared) state
	int getSize();

	boolean isTurbo();

	// Flyweight pattern - methods having extrinsic (unshared) state
	void diagnose(DiagnosticTool tool);
}
