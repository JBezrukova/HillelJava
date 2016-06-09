package OOP.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 29.03.2016.
 */
public class Statistic implements Observer{

    private List<Integer> temperature = new ArrayList<>();
    private List<Integer> humidityes = new ArrayList<Integer>();
    private List<Integer> pressure = new ArrayList<Integer>();
    @Override
    public void update(WeatherStation weatherStation){
        this.temperature.add(weatherStation.getTemperature());
        this.humidityes.add(weatherStation.getHumidity());
        this.pressure.add(weatherStation.getPressure());
    }

    public void display(){
        System.out.println("Temperature: "+temperature);
        System.out.println("Humidity: "+humidityes);
        System.out.println("Pressure: "+pressure);

    }

}

