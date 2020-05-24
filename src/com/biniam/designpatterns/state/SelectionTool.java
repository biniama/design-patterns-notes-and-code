package com.biniam.designpatterns.state;

/**
 * @author Biniam Asnake
 */
public class SelectionTool implements Tool {
	@Override
	public void mouseDown() {
		System.out.println("Selection icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("Draw dashed rectangle");
	}
}
