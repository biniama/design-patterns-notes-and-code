package com.biniam.designpatterns.facade.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class VehicleFacade {

	// Facade method to be called by client to do everything that prepares a vehicle for sale
	public void prepareForSale(Vehicle vehicle) {
		Registration registration = new Registration(vehicle);
		registration.allocateLicensePlate();
		registration.allocateVehicleNumber();

		Documentation.printBrochure(vehicle);

		vehicle.cleanInterior();
		vehicle.cleanExterior();
		vehicle.polishWindows();
		vehicle.takeForTestDrive();
	}
}
