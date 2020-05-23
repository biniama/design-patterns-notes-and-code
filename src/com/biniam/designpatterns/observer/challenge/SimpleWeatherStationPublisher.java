package com.biniam.designpatterns.observer.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Biniam Asnake
 */
public class SimpleWeatherStationPublisher implements WeatherStationPublisher {

	// keep list of subscribers
	private List<WeatherStationSubscriber> weatherStationSubscribers;

	// things subscribers are interested in
	private float temperature;
	private float windSpeed;
	private float pressure;

	public SimpleWeatherStationPublisher() {
		this.weatherStationSubscribers = new ArrayList<>();
	}

	@Override
	public void subscribe(WeatherStationSubscriber subscriber) {
		weatherStationSubscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(WeatherStationSubscriber subscriber) {
		weatherStationSubscribers.remove(subscriber);
	}

	@Override
	public void notifyObservers() {
		weatherStationSubscribers
				.forEach(subscriber ->
						subscriber.update(temperature, windSpeed, pressure));
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
		notifyObservers();
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
		notifyObservers();
	}
}
