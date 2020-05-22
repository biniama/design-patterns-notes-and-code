package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class DecoyDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("Can't quack");
	}

	@Override
	public void fly() {
		System.out.println("Can't fly");
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}
}
