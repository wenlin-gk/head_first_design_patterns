package headfirst.designpatterns.observer.weather.test;

import headfirst.designpatterns.observer.weather.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weather.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weather.observer.HeatIndexDisplay;
import headfirst.designpatterns.observer.weather.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weather.subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
