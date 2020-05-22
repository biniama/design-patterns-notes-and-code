package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		setQuackBehavior(new Quack());
		setFlyBehaviour(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("I am Mallard Duck");
	}
}
