package com.biniam.designpatterns.observer;

/**
 * @author Biniam Asnake
 */
public class SimpleSubscriber implements Subscriber {

	// the publisher to subscribe to
	private Publisher publisher;

	// message to listen to
	private String message;

	public SimpleSubscriber(Publisher publisher) {
		this.publisher = publisher;
		publisher.subscribe(this);
	}

	public void unsubscribe() {
		publisher.unsubscribe(this);
		System.out.println("Unsubscribed " + this.hashCode());
	}

	@Override
	public void update(String message) {
		this.message = message;
		display();
	}

	private void display() {
		System.out.printf("Received message %s in object with hashcode %s\n", message, this.hashCode());
	}
}
