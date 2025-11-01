package strategy;

import observer.WeatherStation;
import java.util.concurrent.ThreadLocalRandom;

public class RealTimeSensorUpdateStrategy implements WeatherUpdateStrategy {
    @Override
    public void update(WeatherStation station) {
        float temperature = (float) ThreadLocalRandom.current().nextDouble(-5.0, 35.0);
        float humidity = (float) ThreadLocalRandom.current().nextDouble(20.0, 90.0);
        station.setMeasurements(temperature, humidity);
    }
}
