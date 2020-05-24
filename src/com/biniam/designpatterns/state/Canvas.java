package com.biniam.designpatterns.state;

/**
 * @author Biniam Asnake
 */
public class Canvas {

	Tool currentTool;

	void mouseDown() {
		currentTool.mouseDown();
	}

	void mouseUp() {
		currentTool.mouseUp();
	}

	public Tool getCurrentTool() {
		return currentTool;
	}

	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
}
