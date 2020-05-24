package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public abstract class Calendar {

	Zone zone;

	ZoneFactory zoneFactory = new ZoneFactory();

	abstract void createCalendar();

	void print() {
		System.out.printf("Printing Zone. Display name: %s offset: %d\n", zone.getDisplayName(), zone.getOffset());
	}
}
