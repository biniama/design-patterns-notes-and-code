package com.biniam.designpatterns.facade.foobarmotorco;

import com.biniam.foobarmotorco.domain.Coupe;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Coupe(new StandardEngine(1300), Vehicle.Color.RED);
		System.out.println(vehicle);

		// NOTICE: Client programs only need to invoke the `prepareForSale()` method on a `VehicleFacade` instance.
		// Therefore, the Client needs no knowledge of what should be done and what other objects are created.
		// In a special circumstance, the individual methods are still available for calling as required.
		// If a new process is needed, then only the Facade needs to change. Hence, details are hidden from the client.
		VehicleFacade facade = new VehicleFacade();
		facade.prepareForSale(vehicle);
	}
}
