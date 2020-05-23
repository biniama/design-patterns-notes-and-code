package com.biniam.designpatterns.strategy;

/**
 * @author Biniam Asnake
 */
public class Squack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("squacking");
	}
}
