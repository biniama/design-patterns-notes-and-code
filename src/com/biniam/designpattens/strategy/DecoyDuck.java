package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		setQuackBehavior(new Mute());
		setFlyBehaviour(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}
}
