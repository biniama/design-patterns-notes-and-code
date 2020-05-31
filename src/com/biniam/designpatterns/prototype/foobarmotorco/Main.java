package com.biniam.designpatterns.prototype.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		VehicleManager vehicleManager = new VehicleManager();

		Vehicle saloon1 = vehicleManager.createSaloon();

		Vehicle saloon2 = vehicleManager.createSaloon();

		Vehicle boxVan = vehicleManager.createBoxVan();

		System.out.println(saloon1);
		System.out.println(saloon2);
		System.out.println(boxVan);
	}
}
