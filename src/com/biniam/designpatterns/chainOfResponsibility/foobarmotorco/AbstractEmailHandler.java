package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public abstract class AbstractEmailHandler implements EmailHandler {

	EmailHandler nextEmailHandler;

	@Override
	public void setNextEmailHandler(EmailHandler nextEmailHandler) {
		this.nextEmailHandler = nextEmailHandler;
	}

	@Override
	public void processHandler(String email) {

		boolean wordFound = false;

		// If there are no words to match against, then the object can be handle it as it is the general filter/last resort.
		if (matchingWords().length == 0) {
			wordFound = true;
		} else {
			// There are words to match
			for (String word : matchingWords()) {
				if (email.contains(word)) {
					wordFound = true;
					break;
				}
			}
		}
		// Can we handle email in this object?
		if (wordFound) {
			handleHere(email);
		} else {
			// Unable to handle here. So, forward to the next handler in chain
			nextEmailHandler.processHandler(email);
		}
	}

	/**
	 * @return array of String objects that this handler is interested in.
	 */
	protected abstract String[] matchingWords();

	/**
	 * only called if this object can actually handle the email and contains whatever code is required.
	 * @param email: String
	 */
	protected abstract void handleHere(String email);
}
