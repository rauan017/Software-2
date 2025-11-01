package strategy;

import observer.WeatherStation;
import java.util.concurrent.ThreadLocalRandom;

public class BatchUpdateStrategy implements WeatherUpdateStrategy {

    private final int samples;

    public BatchUpdateStrategy(int samples) {
        this.samples = Math.max(1, samples);
    }

    @Override
    public void update(WeatherStation station) {
        float tempSum = 0f;
        float humSum = 0f;

        for (int i = 0; i < samples; i++) {
            tempSum += (float) ThreadLocalRandom.current().nextDouble(-3.0, 33.0);
            humSum += (float) ThreadLocalRandom.current().nextDouble(25.0, 85.0);
        }

        station.setMeasurements(tempSum / samples, humSum / samples);
    }
}
