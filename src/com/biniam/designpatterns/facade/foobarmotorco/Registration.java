package com.biniam.designpatterns.facade.foobarmotorco;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class Registration {

	private Vehicle vehicle;

	public Registration(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void allocateLicensePlate() {
		System.out.println("License plate allocated");
	}

	public void allocateVehicleNumber() {
		// Can call the Singleton to do this function
		System.out.println("Vehicle number allocated");
	}
}
