package com.biniam.designpatterns.chainOfResponsibility.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {
		String email = "I need my car repaired";
		Chain.handle(email);
		// Expected output
		// "This is a service email."
	}
}
