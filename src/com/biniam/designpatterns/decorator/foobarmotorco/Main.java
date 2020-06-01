package com.biniam.designpatterns.decorator.foobarmotorco;

import com.biniam.foobarmotorco.domain.Sport;
import com.biniam.foobarmotorco.domain.TurboEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		// Create a Blue Sport Car
		Vehicle myCar = new Sport(new TurboEngine(2000));
		myCar.paint(Vehicle.Color.BLUE);
		System.out.println(myCar);

		// DECORATING - NOTICE THE PRICE CHANGE
		// Add AC
		myCar = new AirConditionedVehicle(myCar);
		System.out.println(myCar);

		// Add Leather seats
		myCar = new LeatherSeatedVehicle(myCar);
		System.out.println(myCar);

		// Add SatNav
		myCar = new SatNavVehicle(myCar);
		System.out.println(myCar);
	}
}
