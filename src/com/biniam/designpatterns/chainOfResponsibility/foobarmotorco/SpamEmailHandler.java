package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class SpamEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String[] {"viagra", "pills", "coca cola"};
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("This is a spam email.");
	}
}
