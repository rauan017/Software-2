package strategy;

import observer.WeatherStation;

public class ManualInputUpdateStrategy implements WeatherUpdateStrategy {
    @Override
    public void update(WeatherStation station) {
        float temperature = 25.5f;
        float humidity = 60.0f;
        station.setMeasurements(temperature, humidity);
    }
}
