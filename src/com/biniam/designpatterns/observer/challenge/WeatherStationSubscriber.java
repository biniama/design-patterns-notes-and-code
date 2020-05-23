package com.biniam.designpatterns.observer.challenge;

/**
 * @author Biniam Asnake
 */
public interface WeatherStationSubscriber {

	void update(float temperature, float windSpeed, float pressure);
}
