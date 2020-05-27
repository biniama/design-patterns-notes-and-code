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
	public void buildBody() {
		System.out.println("[Van] building body");
	}

	@Override
	public void buildChassis() {
		System.out.println("[Van] building chassis");
	}

	@Override
	public void buildReinforcedStorageArea() {
		System.out.println("[Van] building reinforced storage area");
	}

	@Override
	public void buildWindows() {
		System.out.println("[Van] building windows");
	}

	@Override
	public Vehicle getVehicle() {
		return vanInProgress;
	}
}
