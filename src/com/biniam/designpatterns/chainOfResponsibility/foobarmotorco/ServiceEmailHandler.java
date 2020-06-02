package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class ServiceEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String[] {"service", "repair"};
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("This is a service email.");
	}
}
