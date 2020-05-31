package com.biniam.designpatterns.prototype.foobarmotorco;

import com.biniam.foobarmotorco.domain.BoxVan;
import com.biniam.foobarmotorco.domain.Coupe;
import com.biniam.foobarmotorco.domain.Pickup;
import com.biniam.foobarmotorco.domain.Saloon;
import com.biniam.foobarmotorco.domain.Sport;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
// Using efficient technique of lazy-loading by only instantiating the first time each object is needed.
public class VehicleManager {

	private Vehicle saloon, coupe, sport, pickup, boxVan;

	public VehicleManager() {}

	Vehicle createSaloon() {
		if (saloon == null) {
			saloon = new Saloon(new StandardEngine(1300));
			return saloon;
		}
		return (Vehicle) saloon.clone();
	}

	Vehicle createCoupe() {
		if (coupe == null) {
			coupe = new Coupe(new StandardEngine(1300));
			return coupe;
		}
		return (Vehicle) coupe.clone();
	}

	Vehicle createSport() {
		if (sport == null) {
			sport = new Sport(new StandardEngine(1300));
			return sport;
		}
		return (Vehicle) sport.clone();
	}

	Vehicle createPickup() {
		if (pickup == null) {
			pickup = new Pickup(new StandardEngine(1300));
			return pickup;
		}
		return (Vehicle) pickup.clone();
	}

	Vehicle createBoxVan() {
		if (boxVan == null) {
			boxVan = new BoxVan(new StandardEngine(1300));
			return boxVan;
		}
		return (Vehicle) boxVan.clone();
	}
}
