package com.biniam.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Biniam Asnake
 */
public class SimplePublisher implements Publisher {

	private List<Subscriber> subscribers;

	private String message;

	public SimplePublisher() {
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifyObservers() {
		subscribers.forEach(subscriber -> subscriber.update(message));
	}

	// All subscribers are interested about this message.
	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}
}
