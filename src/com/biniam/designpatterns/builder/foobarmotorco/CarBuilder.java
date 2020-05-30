package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.AbstractCar;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class CarBuilder extends VehicleBuilder {

	/**
	 * NOTE:
	 * buildReinforcedStorageArea() is not overridden since it is not applicable to cars.
	 */

	private AbstractCar carInProgress;

	public CarBuilder(AbstractCar carInProgress) {
		this.carInProgress = carInProgress;
	}

	@Override
	public CarBuilder buildBody() {
		System.out.println("[Car] building body");
		return this;
	}

	@Override
	public CarBuilder buildBoot() {
		System.out.println("[Car] building boot");
		return this;
	}

	@Override
	public CarBuilder buildChassis() {
		System.out.println("[Car] building chassis");
		return this;
	}

	@Override
	public CarBuilder buildPassengerArea() {
		System.out.println("[Car] building passenger area");
		return this;
	}

	@Override
	public CarBuilder buildWindows() {
		System.out.println("[Car] building windows");
		return this;
	}

	@Override
	public Vehicle getVehicle() {
		return carInProgress;
	}
}
