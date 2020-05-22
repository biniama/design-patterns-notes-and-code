package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		setQuackBehavior(new Quack());
		setFlyBehaviour(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("I am Red Head Duck");
	}
}
