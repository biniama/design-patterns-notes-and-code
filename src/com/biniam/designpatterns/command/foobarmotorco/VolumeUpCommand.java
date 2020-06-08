package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class VolumeUpCommand implements Command {

	private Radio radio;

	public VolumeUpCommand(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.VolumeUp();
	}

	@Override
	public void undo() {
		radio.volumeDown();
	}
}
