package com.biniam.designpatterns.bridge.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class StandardEngine extends AbstractEngine {

	// not turbo charged
	public StandardEngine(int size) {
		super(size, true);
	}
}
