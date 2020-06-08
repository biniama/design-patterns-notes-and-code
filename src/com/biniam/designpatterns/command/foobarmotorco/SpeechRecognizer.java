package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class SpeechRecognizer {

	private Command upCommand, downCommand;

	public void setCommands(Command upCommand, Command downCommand) {
		this.upCommand = upCommand;
		this.downCommand = downCommand;
	}

	public void hearUpSpoken() {
		upCommand.execute();
	}

	public void hearDownSpoken() {
		downCommand.execute();
	}
}
