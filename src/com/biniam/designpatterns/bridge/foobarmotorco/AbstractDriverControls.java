package com.biniam.designpatterns.bridge.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractDriverControls {

	// To retain flexibility, it is important to design the connection between the Engine and the Controls so that each can VARY INDEPENDENTLY of the other.
	// Composition to delegate actions to
	private Engine engine;

	public AbstractDriverControls(Engine engine) {
		this.engine = engine;
	}

	public void ignitionOn() {
		engine.start();
	}

	public void ignitionOff() {
		engine.stop();
	}

	public void accelerate() {
		engine.increasePower();
	}

	public void brake() {
		engine.decreasePower();
	}
}
