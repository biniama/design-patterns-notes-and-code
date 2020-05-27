package com.biniam.designpatterns.builder.foobarmotorco;

import com.biniam.foobarmotorco.domain.AbstractCar;
import com.biniam.foobarmotorco.domain.AbstractVan;
import com.biniam.foobarmotorco.domain.BoxVan;
import com.biniam.foobarmotorco.domain.Saloon;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class ClientMain {

	public static void main(String[] args) {
		// Create a car instance
		AbstractCar saloon = new Saloon();

		// Create builder for the car
		VehicleBuilder carBuilder = new CarBuilder(saloon);

		// Create director
		VehicleDirector carDirector = new CarDirector();

		// Call the director's build method with the builder
		Vehicle builtCar = carDirector.build(carBuilder);

		System.out.println(builtCar);

		// If you want to change change the type of the Vehicle, just pass the new builder to the director
		AbstractVan boxVan = new BoxVan();
		VehicleBuilder vanBuilder = new VanBuilder();
		VehicleDirector vanDirector = new VanDirector();

		Vehicle builtVan = vanDirector.build(vanBuilder);

		System.out.println(builtVan);
	}
}
