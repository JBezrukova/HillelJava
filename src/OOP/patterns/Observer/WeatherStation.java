package OOP.patterns.Observer;

import sun.awt.windows.WEmbeddedFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 29.03.2016.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int pressure;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    private List<Observer> observers = new ArrayList<>();


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void stateChanged() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
