package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.AbstractVan;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class VanBuilder extends VehicleBuilder {

	/**
	 * NOTE:
	 *      buildBoot()
	 *      buildPassengerArea()
	 * are not overridden since it is not applicable to vans.
	 */

	AbstractVan vanInProgress;

	@Override
	public VanBuilder buildBody() {
		System.out.println("[Van] building body");
		return this;
	}

	@Override
	public VanBuilder buildChassis() {
		System.out.println("[Van] building chassis");
		return this;
	}

	@Override
	public VanBuilder buildReinforcedStorageArea() {
		System.out.println("[Van] building reinforced storage area");
		return this;
	}

	@Override
	public VanBuilder buildWindows() {
		System.out.println("[Van] building windows");
		return this;
	}

	@Override
	public Vehicle getVehicle() {
		return vanInProgress;
	}
}
