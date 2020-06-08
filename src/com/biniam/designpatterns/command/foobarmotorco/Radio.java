package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Radio {

	private final static Integer MIN_VOLUME = 0;
	private final static Integer MAX_VOLUME = 10;
	private final static Integer DEFAULT_VOLUME = 5;

	private boolean on;
	private Integer volume;

	public Radio() {
		on = false;
		volume = DEFAULT_VOLUME;
	}

	public boolean isOn() {
		return on;
	}

	public void on() {
		this.on = true;
		System.out.println("Radio is on. Volume level is " + getVolume());
	}

	public void off() {
		this.on = false;
		System.out.println("Radio is off");
	}

	public Integer getVolume() {
		return volume;
	}

	public void VolumeUp() {
		if (isOn() && getVolume() < MAX_VOLUME) {
			volume++;
			System.out.println("Volume turned up to level " + getVolume());
		}
	}

	public void volumeDown() {
		if (isOn() && getVolume() > MIN_VOLUME) {
			volume--;
			System.out.println("Volume turned down to level " + getVolume());
		}
	}
}
