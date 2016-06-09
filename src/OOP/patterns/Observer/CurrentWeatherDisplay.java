package OOP.patterns.Observer;

/**
 * Created by Юля on 29.03.2016.
 */
public class CurrentWeatherDisplay implements Observer{
    private int temperature;
    private int humidity;
    private int pressure;

    public void display() {
        System.out.println("Temperature: " + temperature + ", humidity: " + humidity + " ,pressure: " + pressure);
    }
@Override
    public void update(WeatherStation weatherStation) {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.pressure = weatherStation.getPressure();
    }

}
