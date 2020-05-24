package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class CentralCalendar extends Calendar {

	@Override
	void createCalendar() {
		zone = zoneFactory.createZone("US/Central");
	}
}
