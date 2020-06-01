package com.biniam.designpatterns.bridge.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class SportDriverControls extends AbstractDriverControls {
	public SportDriverControls(Engine engine) {
		super(engine);
	}


	// IMPORTANT: this additional method is coded interms of the superclass 'abstraction' and NOT the 'implementation' i.e. Engine.
	public void accelerateHard() {
		super.accelerate(); // same as accelerate();
		accelerate();
	}
}
