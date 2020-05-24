package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public class ZoneUsEastern extends Zone {

	@Override
	String getDisplayName() {
		return "US Eastern";
	}

	@Override
	Integer getOffset() {
		return -5;
	}
}
