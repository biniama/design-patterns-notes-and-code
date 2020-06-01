package com.biniam.designpatterns.adapter.foobarmotorco;

/**
 * This is a third-party service. It does NOT implement our Engine interface. Hence, we need to 'adapt' it.
 *
 * The engine is NEVER turbo-charged.
 *
 * @author Biniam Asnake
 */
public class SuperGreenEngine {

	int engineSize;

	public SuperGreenEngine(int engineSize) {
		this.engineSize = engineSize;
	}

	int getEngineSize() {
		return engineSize;
	}
}
