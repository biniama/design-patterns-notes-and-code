package com.biniam.designpatterns.observer.foobarmotorco.usingjavautil;

/**
 * @author Biniam Asnake
 */
public class AutomaticGearbox implements SpeedometerListener {

	@Override
	public void speedChanged(SpeedometerEvent speedometerEvent) {
		if (speedometerEvent.getSpeed() <= 10) {
			System.out.println(AutomaticGearbox.class.getSimpleName() + " First gear");
		} else if (speedometerEvent.getSpeed() <= 20) {
			System.out.println(AutomaticGearbox.class.getSimpleName() + " Second gear");
		} else if (speedometerEvent.getSpeed() <= 30) {
			System.out.println(AutomaticGearbox.class.getSimpleName() + " Third gear");
		} else {
			System.out.println(AutomaticGearbox.class.getSimpleName() + " Forth gear");
		}
	}
}
