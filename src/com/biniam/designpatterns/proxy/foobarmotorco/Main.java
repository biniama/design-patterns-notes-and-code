package com.biniam.designpatterns.proxy.foobarmotorco;

import com.biniam.foobarmotorco.domain.DiagnosticTool;
import com.biniam.foobarmotorco.domain.EngineDiagnosticTool;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {
		EngineProxy engineProxy = new EngineProxy(1300, false);

		DiagnosticTool tool = new EngineDiagnosticTool();
		engineProxy.diagnose(tool);
	}
}
