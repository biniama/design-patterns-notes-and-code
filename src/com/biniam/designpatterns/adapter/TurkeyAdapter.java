package com.biniam.designpatterns.adapter;

/**
 * @author Biniam Asnake
 */
public class TurkeyAdapter implements Duck {
	// TurkeyAdapter is a Duck

	// Needs a reference of turkey - the adaptee - which is set when TurkeyAdapter is created.
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
