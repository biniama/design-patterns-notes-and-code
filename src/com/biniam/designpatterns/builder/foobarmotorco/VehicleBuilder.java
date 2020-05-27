package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public abstract class VehicleBuilder {

	public void buildBody() {}

	public void buildBoot() {}

	public void buildChassis() {}

	public void buildPassengerArea() {}

	public void buildReinforcedStorageArea() {}

	public void buildWindows() {}

	// returns the finished vehicle
	public abstract Vehicle getVehicle();
}
