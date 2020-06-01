package com.biniam.designpatterns.singleton.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Main {

	/**
	 * There are 3 ways of implementing Singleton - Traditional, Modern and Multiple Singleton
	 */
	public static void main(String[] args) {

		// Traditional
		SerialNumberGeneratorTraditional serialNumberGeneratorTraditional = SerialNumberGeneratorTraditional.getInstance();

		System.out.println("Using Traditional Singleton");
		System.out.println("Next serial: " +
				serialNumberGeneratorTraditional.getNextSerial());
		System.out.println("Next serial: " +
				serialNumberGeneratorTraditional.getNextSerial());
		System.out.println("Next serial: " + serialNumberGeneratorTraditional.getNextSerial());


		// Modern
		System.out.println("Using Modern Singleton");
		System.out.println("Next serial: " +
				SerialNumberGeneratorModern.INSTANCE.getNextSerial());
		System.out.println("Next serial: " +
				SerialNumberGeneratorModern.INSTANCE.getNextSerial());
		System.out.println("Next serial: " + SerialNumberGeneratorModern.INSTANCE.getNextSerial());


		// MultitonMultipleSingleton
		System.out.println("Using MultitonMultipleSingleton Singleton");
		System.out.println("VEHICHLE serial: " +
				MultitonMultipleSingleton.VEHICHLE.getNextSerial());
		System.out.println("VEHICHLE serial: " +
				MultitonMultipleSingleton.VEHICHLE.getNextSerial());
		System.out.println("ENGINE serial: " +
				MultitonMultipleSingleton.ENGINE.getNextSerial());
		System.out.println("VEHICHLE serial: " +
				MultitonMultipleSingleton.VEHICHLE.getNextSerial());
	}
}
