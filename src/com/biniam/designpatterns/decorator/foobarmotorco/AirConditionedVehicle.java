package com.biniam.designpatterns.decorator.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class AirConditionedVehicle extends AbstractVehicleOption {
	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	// NOTICE: Decorating takes the vehicle price and add on top of that price
	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 600;
	}

	// Additional method can be defined
	public void setTemperature(int value) {
		System.out.println("Setting temperature of AC to " + value);
	}
}
