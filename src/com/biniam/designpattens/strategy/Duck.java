package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public abstract class Duck {

	public void swim() {
		System.out.println("swimming");
	}

	public void quack() {
		System.out.println("quacking");
	}

	public void fly() {
		System.out.println("flying");
	}

	public abstract void display();

}
