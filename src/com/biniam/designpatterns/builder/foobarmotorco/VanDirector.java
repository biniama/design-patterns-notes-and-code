package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class VanDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {
		builder.buildChassis();
		builder.buildBody();
		builder.buildReinforcedStorageArea();
		builder.buildWindows();
		return builder.getVehicle();
	}
}
