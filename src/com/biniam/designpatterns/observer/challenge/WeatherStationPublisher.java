package com.biniam.designpatterns.observer.challenge;

/**
 * @author Biniam Asnake
 */
public interface WeatherStationPublisher {

	void subscribe(WeatherStationSubscriber subscriber);

	void unsubscribe(WeatherStationSubscriber subscriber);

	void notifyObservers();
}
