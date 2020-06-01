package com.biniam.designpatterns.composite.foobarmotorco;

/**
 * @author Biniam Asnake
 */
public abstract class Item {

	private String description;
	private int cost;

	public Item(String description, int cost) {
		this.description = description;
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public int getCost() {
		return cost;
	}

	public abstract void addItem(Item item);

	public abstract void removeItem(Item item);

	public abstract Item[] getItems();

	// NOTICE: we call getCost() instead of the cost variable
	@Override
	public String toString() {
		return "Item{" + "description='" + description + '\'' + ", cost=" + getCost() + '}';
	}
}
