package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class ElectricWindow {

	private boolean open;

	public ElectricWindow() {
		open = false;
		System.out.println("Windows is closed");
	}

	public boolean isOpen() {
		return open;
	}

	public boolean isClosed() {
		return !open;
	}

	public void openWindow() {
		if (isClosed()) {
			open = true;
			System.out.println("Window is open");
		}
	}

	public void closeWindow() {
		if (isOpen()) {
			open = false;
			System.out.println("Window is closed");
		}
	}
}
