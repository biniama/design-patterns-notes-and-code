package com.biniam.designpatterns.factory.foobarmotorco.approach2;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public abstract class VehicleFactory {

	enum Category { CAR, VAN }

	enum DrivingStyle { ECONOMICAL, MIDRANGE, POWERFUL }

	Vehicle build(DrivingStyle style, Vehicle.Color color) {
		Vehicle vehicle = selectVehicle(style);
		vehicle.paint(color);
		return vehicle;
	}

	// This is the factory method
	// protected - because we only want subclasses to utilize it. It is not intended to be invoked by clients.
	protected abstract Vehicle selectVehicle(DrivingStyle style);

	// Approach 2 - Using 'static' factory methods to determine which Factory to use
	static Vehicle make(Category category, DrivingStyle style, Vehicle.Color color) {

		VehicleFactory factory;

		if (category.equals(Category.CAR)) {
			factory = new CarFactory();
		} else {
			factory = new VanFactory();
		}
		return factory.build(style, color);
	}
}
