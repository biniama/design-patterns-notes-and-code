package com.biniam.designpatterns.abstractFactory.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		String whatToMake = "car"; // "van";

		// Composition
		AbstractVehicleFactory abstractVehicleFactory = null;

		// create the correct factory
		if (whatToMake.equals("car")) {
			abstractVehicleFactory = new CarVehicleFactory();
		} else {
			abstractVehicleFactory = new VanVehicleFactory();
		}

		// Create the vehicle's component parts
		Body vehicleBody = abstractVehicleFactory.getBody();
		Chassis vehicleChassis = abstractVehicleFactory.getChassis();

		// Show what we created
		System.out.println(vehicleBody.getBodyParts());
		System.out.println(vehicleChassis.getChassisParts());
	}
}
