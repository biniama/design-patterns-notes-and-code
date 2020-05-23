package com.biniam.designpatterns.decorator;

/**
 * @author Biniam Asnake
 */
public abstract class Beverage {

	// This field is set by the sub classes. Here, we are just setting a default value.
	String description = "Unknown Beverage";

	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
