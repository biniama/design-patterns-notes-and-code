package com.biniam.designpatterns.factory.challenge;

/**
 * This factory has one method, create zone, which takes the string zone ID.
 * We test the zone ID for each of the possible zone classes we can create,
 * and create the appropriate concrete zone class and return that.
 *
 * The calendar will use the factory to create a zone, and then use that zone class
 * to display the calendar appointments.
 *
 * The calendar doesn't have to worry about the specific type of the zone,
 * and if we want to add support for more time zones, we can do that by updating the Zone Factory
 * without having to modify any calendar code.
 *
 * @author Biniam Asnake
 */
public class ZoneFactory {

	Zone createZone(String zoneId) {
		if (zoneId.equals("US/Pacific")) {
			return new ZoneUsPacific();
		} else if (zoneId.equals("US/Eastern")) {
			return new ZoneUsEastern();
		} else if (zoneId.equals("US/Central")) {
			return new ZoneUsCentral();
		} else {
			return null;
		}
	}
}
