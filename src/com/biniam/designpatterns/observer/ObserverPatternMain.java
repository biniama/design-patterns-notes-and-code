package com.biniam.designpatterns.observer;

/**
 * @author Biniam Asnake
 */
public class ObserverPatternMain {

	public static void main(String[] args) {
		SimplePublisher publisher = new SimplePublisher();

		SimpleSubscriber subscriber1 = new SimpleSubscriber(publisher);
		SimpleSubscriber subscriber2 = new SimpleSubscriber(publisher);

		publisher.setMessage("Broadcast Hello, World!");
		subscriber2.unsubscribe();
	}
}
