package com.biniam.designpatterns.iterator.foobarmotoco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.biniam.foobarmotorco.domain.Coupe;
import com.biniam.foobarmotorco.domain.Saloon;
import com.biniam.foobarmotorco.domain.Sport;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.TurboEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class CarRange implements Iterable<Vehicle> {

	private List<Vehicle> cars;

	public CarRange() {
		this.cars = new ArrayList<>();

		cars.add(new Saloon(new StandardEngine(1300)));
		cars.add(new Saloon(new StandardEngine(1600)));
		cars.add(new Coupe(new StandardEngine(2000)));
		cars.add(new Sport(new TurboEngine(2500)));
	}

	// Notice the return type
	public List<Vehicle> getRange() {
		return cars;
	}

	// Here is the magic
	@Override
	public Iterator<Vehicle> iterator() {
		return cars.listIterator();
	}
}
