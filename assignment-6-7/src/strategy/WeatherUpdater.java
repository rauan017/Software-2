package strategy;

import observer.WeatherStation;

public class WeatherUpdater {

    private WeatherUpdateStrategy strategy;

    public WeatherUpdater(WeatherUpdateStrategy strategy) {
        this.strategy = strategy;
    }

    public void setUpdateStrategy(WeatherUpdateStrategy strategy) {
        this.strategy = strategy;
    }

    public void runUpdate(WeatherStation station) {
        if (strategy != null) {
            strategy.update(station);
        }
    }
}
