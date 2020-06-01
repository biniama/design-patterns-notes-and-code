package com.biniam.designpatterns.flyweight.foobarmotorco;

import com.biniam.foobarmotorco.domain.DiagnosticTool;
import com.biniam.foobarmotorco.domain.Engine;
import com.biniam.foobarmotorco.domain.EngineDiagnosticTool;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {
		// Create the Flyweight Factory
		EngineFlyweightFactory flyweightFactory = new EngineFlyweightFactory();

		// Create a Diagnostic tool
		DiagnosticTool diagnosticTool = new EngineDiagnosticTool();

		Engine standardEngine1 = flyweightFactory.getStandardEngine(1300);
		standardEngine1.diagnose(diagnosticTool);

		Engine standardEngine2 = flyweightFactory.getStandardEngine(1300);
		standardEngine2.diagnose(diagnosticTool);

		// NOTICE: Flyweight benefit - Show that the objects are shared
		// Hashcode should be the same for both standard engines
		System.out.println(standardEngine1.hashCode());
		System.out.println(standardEngine2.hashCode());

		Engine turboEngine1 = flyweightFactory.getTurboEngine(2000);
		turboEngine1.diagnose(diagnosticTool);

		Engine turboEngine2 = flyweightFactory.getTurboEngine(2000);
		turboEngine2.diagnose(diagnosticTool);

		// NOTICE: Flyweight benefit - Show that the objects are shared
		// Hashcode should be the same for both turbo engines
		System.out.println(turboEngine1.hashCode());
		System.out.println(turboEngine2.hashCode());
	}
}
