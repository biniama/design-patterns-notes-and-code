package com.biniam.designpatterns.observer.challenge;

/**
 * @author Biniam Asnake
 */
public class WeatherStationMain {

	public static void main(String[] args) {
		SimpleWeatherStationPublisher publisher = new SimpleWeatherStationPublisher();

		UIWeatherStationSubscriber uiSubscriber = new UIWeatherStationSubscriber(publisher);
		LoggerWeatherStationSubscriber logSubscriber = new LoggerWeatherStationSubscriber(publisher);
		AlertWeatherStationSubscriber alertSubscriber = new AlertWeatherStationSubscriber(publisher);

		publisher.setTemperature(100.0f);
		publisher.setWindSpeed(80.0f);
		publisher.setPressure(32.0f);

		uiSubscriber.unsubscribe();
		logSubscriber.unsubscribe();
		alertSubscriber.unsubscribe();
	}
}
