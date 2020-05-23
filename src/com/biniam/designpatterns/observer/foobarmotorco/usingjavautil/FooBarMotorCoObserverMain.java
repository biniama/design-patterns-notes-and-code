package com.biniam.designpatterns.observer.foobarmotorco.usingjavautil;

/**
 * @author Biniam Asnake
 */
public class FooBarMotorCoObserverMain {

	public static void main(String[] args) {

		// Publisher
		Speedometer speedometer = new Speedometer();

		// Subscribers
		SpeedMonitor speedMonitor =  new SpeedMonitor();
		AutomaticGearbox automaticGearbox = new AutomaticGearbox();

		// subscribe
		speedometer.addSpeedometerListener(speedMonitor);
		speedometer.addSpeedometerListener(automaticGearbox);

		speedometer.setCurrentSpeed(20);
	}
}
