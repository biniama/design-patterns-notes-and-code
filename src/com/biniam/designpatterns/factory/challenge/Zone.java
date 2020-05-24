package com.biniam.designpatterns.factory.challenge;

/**
 * @author Biniam Asnake
 */
public abstract class Zone {

	String displayName;

	Integer offset;

	abstract String getDisplayName();

	abstract Integer getOffset();
}
