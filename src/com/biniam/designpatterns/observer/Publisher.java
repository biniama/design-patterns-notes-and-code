package com.biniam.designpatterns.observer;

/**
 * @author Biniam Asnake
 */
public interface Publisher {

	void subscribe(Subscriber subscriber);

	void unsubscribe(Subscriber subscriber);

	void notifyObservers();
}
