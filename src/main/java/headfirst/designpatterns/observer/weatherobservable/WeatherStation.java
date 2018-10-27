package headfirst.designpatterns.observer.weatherobservable;

import headfirst.designpatterns.observer.weatherobservable.observable.WeatherData;
import headfirst.designpatterns.observer.weatherobservable.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weatherobservable.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weatherobservable.observer.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
