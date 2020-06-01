package com.biniam.designpatterns.bridge.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {
		Engine engine = new StandardEngine(1300);

		StandardDriverControls control1 = new StandardDriverControls(engine);
		control1.ignitionOn();
		control1.accelerate();
		control1.brake();
		control1.ignitionOff();

		SportDriverControls control2 = new SportDriverControls(engine);
		control2.ignitionOn();
		control2.accelerate();
		control2.accelerateHard(); // new behavior
		control2.brake();
		control2.ignitionOff();

	}
}
