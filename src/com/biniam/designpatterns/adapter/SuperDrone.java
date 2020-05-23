package com.biniam.designpatterns.adapter;

/**
 * @author Biniam Asnake
 */
public class SuperDrone implements Drone {
	@Override
	public void beep() {
		System.out.println("Beep beep beep");
	}

	@Override
	public void spin_roters() {
		System.out.println("Roters are spinning");
	}

	@Override
	public void take_off() {
		System.out.println("Take off");
	}
}
