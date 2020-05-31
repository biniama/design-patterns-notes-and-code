package com.biniam.designpatterns.abstractFactory.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class CarVehicleFactory extends AbstractVehicleFactory {
	@Override
	Body getBody() {
		return new CarBody();
	}

	@Override
	Chassis getChassis() {
		return new CarChassis();
	}
}
