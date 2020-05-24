package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class EasternCalendar extends Calendar {

	@Override
	public void createCalendar() {
		zone = zoneFactory.createZone("US/Eastern");
	}
}
