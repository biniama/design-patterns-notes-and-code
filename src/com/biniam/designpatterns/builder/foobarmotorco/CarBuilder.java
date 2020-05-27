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
	public void buildBody() {
		System.out.println("[Car] building body");
	}

	@Override
	public void buildBoot() {
		System.out.println("[Car] building boot");
	}

	@Override
	public void buildChassis() {
		System.out.println("[Car] building chassis");
	}

	@Override
	public void buildPassengerArea() {
		System.out.println("[Car] building passenger area");
	}

	@Override
	public void buildWindows() {
		System.out.println("[Car] building windows");
	}

	@Override
	public Vehicle getVehicle() {
		return carInProgress;
	}
}
