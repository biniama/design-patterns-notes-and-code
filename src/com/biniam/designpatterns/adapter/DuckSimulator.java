package com.biniam.designpatterns.adapter;

/**
 * @author Biniam Asnake
 */
public class DuckSimulator {

	public static void main(String[] args) {

		Turkey turkey = new WildTurkey();

		// Adapt the turkey to Duck using TurkeyAdapter
		Duck turkeyAdaptedToDuck = new TurkeyAdapter(turkey);

		// Now, you can call the Duck methods on a Turkey.
		testDuck(turkeyAdaptedToDuck);

		// second example
		Drone drone = new SuperDrone();
		Duck droneAdapter = new DroneAdapter(drone);
		testDuck(droneAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
