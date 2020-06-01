package com.biniam.foobarmotorco.domain;

/**
 * @author Biniam Asnake
 */
public class EngineDiagnosticTool implements DiagnosticTool {
	@Override
	public void runDiagnosis(Object obj) {
		System.out.println("Starting engine diagnosis tool for " + obj);

		try {
			Thread.sleep(5000);
			System.out.println("Engine diagnosis complete");
		} catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Engine diagnosis interrupted");
		}
	}
}
