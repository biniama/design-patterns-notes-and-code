package com.biniam.designpatterns.observer.challenge;

/**
 * @author Biniam Asnake
 */
public class LoggerWeatherStationSubscriber implements WeatherStationSubscriber {

	private WeatherStationPublisher publisher;

	private float temperature;
	private float windSpeed;
	private float pressure;

	public LoggerWeatherStationSubscriber(WeatherStationPublisher publisher) {
		this.publisher = publisher;
		this.publisher.subscribe(this);
	}

	@Override
	public void update(float temperature, float windSpeed, float pressure) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.pressure = pressure;

		log();
	}

	public void unsubscribe() {
		publisher.unsubscribe(this);
		System.out.println("Unsubscribed " + this.hashCode());
	}

	private void log() {
		System.out.printf("Temperature %f, WindSpeed %f, Pressure %f in object with hashcode %s\n", temperature, windSpeed, pressure, this.hashCode());
	}
}
