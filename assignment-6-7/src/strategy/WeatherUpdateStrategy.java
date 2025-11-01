package strategy;

import observer.WeatherStation;

public interface WeatherUpdateStrategy {
    void update(WeatherStation station);
}
