package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class RedHeadDuck extends Duck implements Quackable, Flyable {

	@Override
	public void quack() {
		System.out.println("quacking");
	}

	@Override
	public void fly() {
		System.out.println("flying");
	}

	@Override
	public void display() {
		System.out.println("I am Red Head Duck");
	}
}
