package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class StrategyMain {

	public static void main(String[] args) {
		// 'Duck' is abstract; cannot be instantiated
		// Duck duck = new Duck();

		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.quack();
		mallardDuck.fly();

		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.quack();
		// can't all fly on rubberDuck since it doesn't implement Flyable
		// rubberDuck.fly();
	}
}
