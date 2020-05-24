package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class ZoneUsPacific extends Zone {

	@Override
	String getDisplayName() {
		return "US Pacific";
	}

	@Override
	Integer getOffset() {
		return -8;
	}
}
