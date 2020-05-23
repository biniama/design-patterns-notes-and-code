package com.biniam.designpatterns.adapter;

/**
 * @author Biniam Asnake
 */
public class DroneAdapter implements Duck {

	Drone drone;

	public DroneAdapter(Drone drone) {
		this.drone = drone;
	}

	@Override
	public void quack() {
		drone.beep();
	}

	@Override
	public void fly() {
		drone.spin_roters();
		drone.take_off();
	}
}
