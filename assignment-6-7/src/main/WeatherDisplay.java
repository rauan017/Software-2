package main;

import observer.WeatherObserver;

public class WeatherDisplay implements WeatherObserver {

    private final String name;
    private float temperature;
    private float humidity;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.printf("%s: %.1f°C, %.1f%%%n", name, temperature, humidity);
    }

}
