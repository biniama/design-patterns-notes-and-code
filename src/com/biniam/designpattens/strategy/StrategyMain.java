package com.biniam.designpattens.strategy;

/**
 * @author Biniam Asnake
 */
public class StrategyMain {

	public static void main(String[] args) {
		// 'Duck' is abstract; cannot be instantiated
		// Duck duck = new Duck();

		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.quack();
		mallardDuck.fly();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.quack();
		rubberDuck.fly();

	}
}
