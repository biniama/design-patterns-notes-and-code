package com.biniam.designpatterns.composite.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public class Main {

	public static void main(String[] args) {

		Item nut = new Part("Nut", 5);
		Item bolt = new Part("Bolt", 9);
		Item panel = new Part("Panel", 35);

		// Assemble the parts
		// Notice, from the client size, Assembly and Part are accessed in a similar manner - Composite Pattern.
		// Assemblies have computed the total cost without the client program needing to know how.
		Item gizmo = new Assembly("Gizmo");
		gizmo.addItem(nut);
		gizmo.addItem(bolt);
		gizmo.addItem(panel);

		Item widget = new Assembly("Widget");
		widget.addItem(gizmo);
		widget.addItem(nut);

		// Print the items
		System.out.println(nut);
		System.out.println(bolt);
		System.out.println(panel);
		System.out.println(gizmo);
		System.out.println(widget);
	}
}
