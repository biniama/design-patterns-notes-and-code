package com.biniam.designpatterns.state;

/**
 * @author Biniam Asnake
 */
public class CanvasMain {

	public static void main(String[] args) {
		var canvas = new Canvas();
		canvas.setCurrentTool(new SelectionTool());
		canvas.mouseDown();
		canvas.mouseUp();

		// resetting the state on runtime
		canvas.setCurrentTool(new BrushTool());
		canvas.mouseDown();
		canvas.mouseUp();

		// resetting the state on runtime
		canvas.setCurrentTool(new EraseTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}
}
