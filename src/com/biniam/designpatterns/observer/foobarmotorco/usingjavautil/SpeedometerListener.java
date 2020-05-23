package com.biniam.designpatterns.observer.foobarmotorco.usingjavautil;

import java.util.EventListener;

/**
 * @author Biniam Asnake
 */
public interface SpeedometerListener extends EventListener {
	// EventListener is just a tagging interface that all event listener interfaces must extend.
	// It has no methods to override
	// EventListener is an interface and we should implement it in a class.
	// But, SpeedometerListener is an INTERFACE, so, we should `extend` it.

	void speedChanged(SpeedometerEvent speedometerEvent);
}
