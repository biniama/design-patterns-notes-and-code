package com.biniam.designpatterns.iterator.foobarmotoco;

import java.util.Arrays;
import java.util.Iterator;

import com.biniam.foobarmotorco.domain.BoxVan;
import com.biniam.foobarmotorco.domain.Pickup;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.TurboEngine;
import com.biniam.foobarmotorco.domain.Vehicle;

/**
 * @author Biniam Asnake
 */
public class VanRange implements Iterable {

	private Vehicle[] vans;

	public VanRange() {
		vans = new Vehicle[3];

		vans[0] = new BoxVan(new StandardEngine(1600));
		vans[1] = new BoxVan(new StandardEngine(2000));
		vans[2] = new Pickup(new TurboEngine(2200));
	}

	// Notice the return type
	public Vehicle[] getRange() {
		return vans;
	}

	@Override
	public Iterator iterator() {
		return Arrays.asList(vans).listIterator();
	}
}
