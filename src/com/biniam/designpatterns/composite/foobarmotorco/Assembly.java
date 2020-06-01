package com.biniam.designpatterns.composite.foobarmotorco;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Biniam Asnake
 */
public class Assembly extends Item {

	List<Item> items;

	public Assembly(String description) {
		super(description, 0 /* initally, cost should be 0 */);
		items = new ArrayList<>();
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public Item[] getItems() {
		return items.toArray(new Item[items.size()]);
	}

	// Have to override getCost() to add cost of items in the list

	@Override
	public int getCost() {
		int total = 0;
		for (Item item : items) {
			total += item.getCost();
		}
		return total;
	}
}
