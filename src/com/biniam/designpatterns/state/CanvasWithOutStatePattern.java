package com.biniam.designpatterns.state;

/**
 * @author Biniam Asnake
 */
public class CanvasWithOutStatePattern {

	enum ToolType { SELECTION, BRUSH, ERASE };

	ToolType currentTool;

	/*  PROBLEMS
		1. Code duplication
		2. No ability to change the behavior during runtime
		3. Unmaintainable - Managing change is needs a lot of work
		4. Difficult to extend (keyboard up/down, draw a circle)

		Requirement:
		We want the methods to respond to the different STATEs of the currentTool
	 */
	void mouseDown() {
		if (currentTool.equals(ToolType.SELECTION)) {
			System.out.println("Selection icon");
		} else if (currentTool.equals(ToolType.BRUSH)) {
			System.out.println("Brush icon");
		} else if (currentTool.equals(ToolType.ERASE)) {
			System.out.println("Erase icon");
		}
	}

	void mouseUp() {
		if (currentTool.equals(ToolType.SELECTION)) {
			System.out.println("Draw dashed rectangle");
		} else if (currentTool.equals(ToolType.BRUSH)) {
			System.out.println("Draw a line");
		} else if (currentTool.equals(ToolType.ERASE)) {
			System.out.println("Erase something");
		}
	}

}
