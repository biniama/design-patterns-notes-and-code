package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class WindowDownCommand implements Command {
	private ElectricWindow window;

	public WindowDownCommand(ElectricWindow window) {
		this.window = window;
	}

	@Override
	public void execute() {
		window.openWindow();
	}

	@Override
	public void undo() {
		window.closeWindow();
	}
}
