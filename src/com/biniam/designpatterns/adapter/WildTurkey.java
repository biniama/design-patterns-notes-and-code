package com.biniam.designpatterns.adapter;

/**
 * @author Biniam Asnake
 */
public class WildTurkey implements Turkey {

	public void gobble() {
		System.out.println("Turkey Gobbling");
	}

	public void fly() {
		System.out.println("Turkey Flying");
	}
}
