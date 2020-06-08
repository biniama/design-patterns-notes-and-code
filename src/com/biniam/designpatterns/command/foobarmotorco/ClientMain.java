package com.biniam.designpatterns.command.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class ClientMain {

	public static void main(String[] args) {

		// Create a radio and its up/down command objects
		Radio radio =  new Radio();
		radio.on();

		Command volumeUpCommand = new VolumeUpCommand(radio);
		Command volumeDownCommand = new VolumeDownCommand(radio);

		// Create ElectricWindow and its up/down command objects
		ElectricWindow electricWindow = new ElectricWindow();
		Command windowUpCommand = new WindowUpCommand(electricWindow);
		Command windowDownCommand = new WindowDownCommand(electricWindow);

		// Create Speech Recognizer object
		SpeechRecognizer speechRecognizer = new SpeechRecognizer();

		// Control the radio
		speechRecognizer.setCommands(volumeUpCommand, volumeDownCommand);
		System.out.println("Speech recognizer controlling the radio");
		speechRecognizer.hearUpSpoken();
		speechRecognizer.hearUpSpoken();
		speechRecognizer.hearDownSpoken();

		// Control the electric window
		speechRecognizer.setCommands(windowUpCommand, windowDownCommand);
		System.out.println("Speech recognizer controlling the electric window");
		speechRecognizer.hearDownSpoken();
		speechRecognizer.hearUpSpoken();
	}
}
