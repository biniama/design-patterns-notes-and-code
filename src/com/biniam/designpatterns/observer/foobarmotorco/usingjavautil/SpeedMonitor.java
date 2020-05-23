package com.biniam.designpatterns.observer.foobarmotorco.usingjavautil;

/**
 * @author Biniam Asnake
 */
public class SpeedMonitor implements SpeedometerListener {

	private static final int SPEED_TO_ALERT = 50;

	@Override
	public void speedChanged(SpeedometerEvent speedometerEvent) {
		if (speedometerEvent.getSpeed() >= SPEED_TO_ALERT) {
			System.out.println(SpeedMonitor.class.getSimpleName() + " ALERT: Driving too fast! " + speedometerEvent.getSpeed() + " Event coming from " + speedometerEvent.getSource());
		} else {
			System.out.println(SpeedMonitor.class.getSimpleName() + " Keep it nice and steady " + speedometerEvent.getSpeed());
		}
	}
}
