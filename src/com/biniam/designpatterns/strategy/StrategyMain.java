package com.biniam.designpatterns.strategy;

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
		mallardDuck.performQuack();;
		mallardDuck.performFly();

		Duck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.swim();
		rubberDuck.performQuack();
		rubberDuck.performFly();

		Duck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.swim();
		decoyDuck.performQuack();
		decoyDuck.performFly();
	}
}
