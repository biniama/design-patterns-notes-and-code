package com.biniam.designpatterns.factory.foobarmotorco.approach1;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public abstract class VehicleFactory {

	enum DrivingStyle { ECONOMICAL, MIDRANGE, POWERFUL }

	Vehicle build(DrivingStyle style, Vehicle.Color color) {
		Vehicle vehicle = selectVehicle(style);
		vehicle.paint(color);
		return vehicle;
	}

	// This is the factory method
	// protected - because we only want subclasses to utilize it. It is not intended to be invoked by clients.
	protected abstract Vehicle selectVehicle(DrivingStyle style);
}
