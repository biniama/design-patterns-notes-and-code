package com.biniam.designpatterns.singleton.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class SerialNumberGeneratorTraditional {

	private static SerialNumberGeneratorTraditional INSTANCE;

	private SerialNumberGeneratorTraditional() {}

	public static SerialNumberGeneratorTraditional getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SerialNumberGeneratorTraditional();
		}
		return INSTANCE;
	}

	// instance variable
	private int count;

	// instance method
	public synchronized int getNextSerial() {
		return ++count;
	}


}
