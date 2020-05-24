package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class ZoneUsCentral extends Zone {
	@Override
	String getDisplayName() {
		return "US Central";
	}

	@Override
	Integer getOffset() {
		return -6;
	}
}
