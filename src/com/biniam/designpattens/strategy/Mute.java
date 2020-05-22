package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("mute");
	}
}
