package com.biniam.designpatterns.strategy;

/**
 * @author Biniam Asnake
 */
public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("quacking");
	}
}
