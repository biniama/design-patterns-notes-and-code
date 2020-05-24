package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class PacificCalendar extends Calendar {

	@Override
	public void createCalendar() {
		zone = zoneFactory.createZone("US/Pacific");
	}
}
