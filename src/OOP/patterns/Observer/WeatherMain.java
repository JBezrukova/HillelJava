package OOP.patterns.Observer;

import com.sun.deploy.util.SyncAccess;

/**
 * Created by Юля on 29.03.2016.
 */
public class WeatherMain {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        Statistic statistic = new Statistic();

        weatherStation.addObserver(currentWeatherDisplay);
        weatherStation.addObserver(forecastDisplay);
        weatherStation.addObserver(statistic);

        weatherStation.setTemperature(20);
        weatherStation.setHumidity(35);
        weatherStation.setPressure(790);
        weatherStation.stateChanged();

        currentWeatherDisplay.display();
        forecastDisplay.display();
        statistic.display();

        weatherStation.removeObserver(forecastDisplay);
        weatherStation.setTemperature(25);
        weatherStation.setHumidity(50);
        weatherStation.setPressure(730);
        weatherStation.stateChanged();

        currentWeatherDisplay.display();
        statistic.display();
    }


}
