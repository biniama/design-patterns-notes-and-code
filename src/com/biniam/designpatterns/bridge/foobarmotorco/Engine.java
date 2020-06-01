package com.biniam.designpatterns.bridge.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public interface Engine {

	int getSize();

	boolean isTurbo();

	void start();

	void stop();

	void increasePower();

	void decreasePower();
}
