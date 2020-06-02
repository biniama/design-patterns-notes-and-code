package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class SalesEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String[] {"buy", "purchase"};
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("This is a sales email.");
	}
}
