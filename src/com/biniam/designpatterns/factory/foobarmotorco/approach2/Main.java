package com.biniam.designpatterns.factory.foobarmotorco.approach2;

import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		Vehicle car = VehicleFactory.make(VehicleFactory.Category.CAR, VehicleFactory.DrivingStyle.ECONOMICAL, Vehicle.Color.BLUE);
		System.out.println(car);

		Vehicle van = VehicleFactory.make(VehicleFactory.Category.VAN, VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Color.WHITE);
		System.out.println(van);
	}
}
