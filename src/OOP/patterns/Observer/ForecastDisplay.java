package OOP.patterns.Observer;

import java.util.Random;

/**
 * Created by Юля on 29.03.2016.
 */
public class ForecastDisplay implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;
    private Random random = new Random();
@Override
    public void update(WeatherStation weatherStation){
        this.temperature = randomize(weatherStation.getTemperature());
        this.humidity = randomize(weatherStation.getHumidity());
        this.pressure = randomize(weatherStation.getPressure());
    }
    public void display(){
        System.out.println("Forecast: temperature: " + temperature + ", humidity: " + humidity + " ,pressure: " + pressure);
    }

    private int randomize(int number){
        double seed = random.nextDouble()/5+0.9;
        return (int )(number*seed);
    }
}
