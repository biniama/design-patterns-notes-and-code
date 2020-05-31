package com.biniam.designpatterns.factory.foobarmotorco.approach2;

import com.biniam.foobarmotorco.domain.Coupe;
import com.biniam.foobarmotorco.domain.Saloon;
import com.biniam.foobarmotorco.domain.Sport;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.TurboEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class CarFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {

		if (style.equals(DrivingStyle.ECONOMICAL)) {
			return new Saloon(new StandardEngine(1300));
		} else if (style.equals(DrivingStyle.MIDRANGE)) {
			return new Coupe(new StandardEngine(1600));
		} else {
			return new Sport(new TurboEngine(2000));
		}
	}
}
