package com.biniam.designpatterns.abstractFactory.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class VanVehicleFactory extends AbstractVehicleFactory {
	@Override
	Body getBody() {
		return new VanBody();
	}

	@Override
	Chassis getChassis() {
		return new VanChassis();
	}
}
