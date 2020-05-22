package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class FlyWithWings implements FlyBehaviour {
	@Override
	public void fly() {
		System.out.println("flying");
	}
}
