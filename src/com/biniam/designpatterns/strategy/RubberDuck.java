package com.biniam.designpatterns.strategy;

/**
 * @author Biniam Asnake
 */
public class RubberDuck extends Duck {

	public RubberDuck() {
		setQuackBehavior(new Squack());
		setFlyBehaviour(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("I am Rubber Duck");
	}
}
