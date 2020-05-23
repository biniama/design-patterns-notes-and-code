package com.biniam.designpatterns.strategy;

/**
 * @author Biniam Asnake
 */
public abstract class Duck {

	private FlyBehaviour flyBehaviour;
	private QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("swimming");
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public abstract void display();

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
