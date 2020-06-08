package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class VolumeDownCommand implements Command {
	private Radio radio;

	public VolumeDownCommand(Radio radio) {
		this.radio = radio;
	}

	@Override
	public void execute() {
		radio.volumeDown();
	}

	@Override
	public void undo() {
		radio.VolumeUp();
	}
}
