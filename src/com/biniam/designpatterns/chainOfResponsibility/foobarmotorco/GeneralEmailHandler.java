package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class GeneralEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		return new String[0];   // match anything
	}

	@Override
	protected void handleHere(String email) {
		System.out.println("Email handled by general enquiries.");
	}
}
