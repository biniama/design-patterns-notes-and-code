package com.biniam.designpatterns.singleton.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public enum MultitonMultipleSingleton {

	// add as many enum variables as you want and they will have their own counter
	VEHICHLE,
	ENGINE;

	private int count;

	public synchronized int getNextSerial() {
		return ++count;
	}
}
