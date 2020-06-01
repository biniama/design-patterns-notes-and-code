package com.biniam.designpatterns.decorator.foobarmotorco;

import com.biniam.foobarmotorco.domain.AbstractVehicle;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractVehicleOption extends AbstractVehicle {

	// NOTICE: protected to be accessed in subclasses
	protected Vehicle decoratedVehicle;

	public AbstractVehicleOption(Vehicle vehicle) {
		super(vehicle.getEngine(), vehicle.getColor());
		decoratedVehicle = vehicle;
	}
}
