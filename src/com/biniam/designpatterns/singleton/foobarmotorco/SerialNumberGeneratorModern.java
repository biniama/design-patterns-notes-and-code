package com.biniam.designpatterns.singleton.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public enum SerialNumberGeneratorModern {

	INSTANCE;

	private int count;

	public synchronized int getNextSerial() {
		return ++count;
	}
}
