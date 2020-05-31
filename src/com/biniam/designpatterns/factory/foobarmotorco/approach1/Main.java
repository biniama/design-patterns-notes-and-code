package com.biniam.designpatterns.factory.foobarmotorco.approach1;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL, Vehicle.Color.BLUE);
		System.out.println(car);

		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Color.WHITE);
		System.out.println(van);
	}
}
