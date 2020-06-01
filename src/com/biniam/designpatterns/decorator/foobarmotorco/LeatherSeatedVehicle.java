package com.biniam.designpatterns.decorator.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class LeatherSeatedVehicle extends AbstractVehicleOption {
	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	// NOTICE: Decorating takes the vehicle price and add on top of that price
	@Override
	public int getPrice() {
		return decoratedVehicle.getPrice() + 1200;
	}
}
