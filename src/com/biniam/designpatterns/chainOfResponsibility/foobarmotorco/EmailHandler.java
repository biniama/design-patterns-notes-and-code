package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public interface EmailHandler {

	void setNextEmailHandler(EmailHandler nextEmailHandler);

	void processHandler(String email);
}
