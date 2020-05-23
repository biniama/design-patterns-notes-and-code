package com.biniam.designpatterns.observer.foobarmotorco.usingjavautil;

import java.util.EventObject;

/**
 * @author Biniam Asnake
 */
public class SpeedometerEvent extends EventObject {

	private int speed;

	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source the object on which the Event initially occurred
	 * @throws IllegalArgumentException if source is null
	 */
	public SpeedometerEvent(Object source, int speed) {

		// EventObject provides a getSource() so that listeners will be able to tell the exact object that gave rise to the event, if they need to know it
		// for some reason.
		super(source);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
}
