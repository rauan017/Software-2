package observer;

import strategy.WeatherUpdateStrategy;
import strategy.WeatherUpdater;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {

    private final List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private final WeatherUpdater updater;

    public WeatherStation(WeatherUpdateStrategy initialStrategy) {
        this.updater = new WeatherUpdater(initialStrategy);
    }

    public void setUpdateStrategy(WeatherUpdateStrategy strategy) {
        this.updater.setUpdateStrategy(strategy);
    }

    public void performUpdate() {
        this.updater.runUpdate(this);
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void addObserver(WeatherObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(WeatherObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver o : observers) {
            o.update(temperature, humidity);
        }
    }
}
