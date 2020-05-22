package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class FlyNoWay implements FlyBehaviour {
	@Override
	public void fly() {
		System.out.println("Can't fly");
	}
}
