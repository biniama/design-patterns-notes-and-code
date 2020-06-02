package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Chain {

	public static void handle(String email) {
		// Create handler objects
		SpamEmailHandler spamEmailHandler = new SpamEmailHandler();
		SalesEmailHandler salesEmailHandler = new SalesEmailHandler();
		ServiceEmailHandler serviceEmailHandler = new ServiceEmailHandler();
		GeneralEmailHandler generalEmailHandler = new GeneralEmailHandler();

		// Chain them together
		spamEmailHandler.setNextEmailHandler(salesEmailHandler);
		salesEmailHandler.setNextEmailHandler(serviceEmailHandler);
		serviceEmailHandler.setNextEmailHandler(generalEmailHandler);

		// Start the ball rolling
		spamEmailHandler.processHandler(email);
	}
}
