package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public abstract class VehicleBuilder {

	public VehicleBuilder buildBody() {
		return this;
	}

	public VehicleBuilder buildBoot() {
		return this;
	}

	public VehicleBuilder buildChassis() {
		return this;
	}

	public VehicleBuilder buildPassengerArea() {
		return this;
	}

	public VehicleBuilder buildReinforcedStorageArea() {
		return this;
	}

	public VehicleBuilder buildWindows() {
		return this;
	}

	// returns the finished vehicle
	public abstract Vehicle getVehicle();
}
