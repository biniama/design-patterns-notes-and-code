package com.biniam.designpatterns.factory.foobarmotorco.approach1;

import com.biniam.foobarmotorco.domain.BoxVan;
import com.biniam.foobarmotorco.domain.Pickup;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.TurboEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class VanFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {

		if (style.equals(DrivingStyle.ECONOMICAL) || style.equals(DrivingStyle.MIDRANGE)) {
			return new BoxVan(new StandardEngine(2200));
		} else {
			return new Pickup(new TurboEngine(2500));
		}
	}
}
