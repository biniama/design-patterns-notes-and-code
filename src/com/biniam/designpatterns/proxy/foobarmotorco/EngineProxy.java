package com.biniam.designpatterns.proxy.foobarmotorco;

import com.biniam.foobarmotorco.domain.DiagnosticTool;
import com.biniam.foobarmotorco.domain.Engine;
import com.biniam.foobarmotorco.domain.StandardEngine;
import com.biniam.foobarmotorco.domain.TurboEngine;

/**
 * @author Biniam Asnake
 */
public class EngineProxy implements Engine {

	private Engine engine;

	public EngineProxy(int size, boolean turbo) {

		if (turbo) {
			engine = new TurboEngine(size);
		} else {
			engine = new StandardEngine(size);
		}
	}

	// This method is time-consuming. Hence, we run it in a new Thread and return immediately.
	@Override
	public void diagnose(DiagnosticTool tool) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("(Running tool as thread)");
				engine.diagnose(tool);
			}
		});
		thread.start();

		// NOTICE: This is where wer return immediately before the execution of the thread.
		System.out.println("EngineProxy diagnose() method finished");
	}

	@Override
	public int getSize() {
		return engine.getSize();
	}

	@Override
	public boolean isTurbo() {
		return engine.isTurbo();
	}
}
