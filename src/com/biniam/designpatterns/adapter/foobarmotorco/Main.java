package com.biniam.designpatterns.adapter.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		SuperGreenEngine superGreenEngine = new SuperGreenEngine(2000);

		// Adapt it
		SuperGreenEngineAdapter adapter = new SuperGreenEngineAdapter(superGreenEngine);

		System.out.println(adapter);

		System.out.println("Engine Size adapted method" + adapter.getSize());
	}
}
