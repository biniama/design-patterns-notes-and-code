package com.biniam.designpatterns.observer.foobarmotorco.usingjavautil;

import java.util.ArrayList;
import java.util.List;

/**
 * Keeps list of speedometer listeners and then, notify them when current speed changes.
 */
public class Speedometer {

	private int currentSpeed;

	private List<SpeedometerListener> speedometerListeners;

	public Speedometer() {
		this.currentSpeed = 0;
		this.speedometerListeners = new ArrayList<>();
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
		fireSpeedChanged(); // notify listeners
	}

	private void fireSpeedChanged() {
		SpeedometerEvent speedometerEvent =  new SpeedometerEvent(this, currentSpeed);

		speedometerListeners.forEach(speedometerListener -> {
			speedometerListener.speedChanged(speedometerEvent);
		});
	}

	void addSpeedometerListener(SpeedometerListener speedometerListener) {
		speedometerListeners.add(speedometerListener);
		System.out.println("Subscription done");
	}

	void removeSpeedometerListener(SpeedometerListener speedometerListener) {
		speedometerListeners.remove(speedometerListener);
		System.out.println("Unsubscription done");
	}
}
