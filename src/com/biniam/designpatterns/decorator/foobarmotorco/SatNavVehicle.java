package com.biniam.designpatterns.decorator.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class SatNavVehicle extends AbstractVehicleOption {
	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	// NOTICE: Decorating takes the vehicle price and add on top of that price
	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1600;
	}

	// Additional method can be defined
	public void setDestination(String target) {
		System.out.println("Setting the destination to " + target);
	}
}
