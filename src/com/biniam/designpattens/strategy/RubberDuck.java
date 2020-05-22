package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class RubberDuck extends Duck implements Quackable {

	@Override
	public void quack() {
		System.out.println("squeeking");
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}
}
