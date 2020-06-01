package com.biniam.designpatterns.flyweight.foobarmotorco;

import java.util.HashMap;
import java.util.Map;

import com.biniam.foobarmotorco.domain.Engine;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.TurboEngine;

/**
 * @author Biniam Asnake
 */
public class EngineFlyweightFactory {

	private Map<Integer, Engine> standardEnginePool;

	private Map<Integer, Engine> turboEnginePool;

	public EngineFlyweightFactory() {
		this.standardEnginePool = new HashMap<>();
		this.turboEnginePool = new HashMap<>();
	}

	public Engine getStandardEngine(int size) {
		Engine engine = standardEnginePool.get(size);

		if (engine == null) {
			engine = new StandardEngine(size);
			standardEnginePool.put(size, engine);
		}
		return engine;
	}

	public Engine getTurboEngine(int size) {
		Engine engine = turboEnginePool.get(size);

		if (engine == null) {
			engine = new TurboEngine(size);
			turboEnginePool.put(size, engine);
		}
		return engine;
	}
}