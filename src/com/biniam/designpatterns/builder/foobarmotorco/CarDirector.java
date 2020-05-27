package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class CarDirector extends VehicleDirector {

	// Chaining
	@Override
	public Vehicle build(VehicleBuilder builder) {
		builder.buildChassis();
		builder.buildBody();
		builder.buildPassengerArea();
		builder.buildBoot();
		builder.buildWindows();
		return builder.getVehicle();
	}
}
