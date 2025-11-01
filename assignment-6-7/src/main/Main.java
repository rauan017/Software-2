package main;

import observer.WeatherStation;
import strategy.BatchUpdateStrategy;
import strategy.ManualInputUpdateStrategy;
import strategy.RealTimeSensorUpdateStrategy;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(new ManualInputUpdateStrategy());

        WeatherDisplay phone = new WeatherDisplay("Phone");
        WeatherDisplay dashboard = new WeatherDisplay("Dashboard");

        station.addObserver(phone);
        station.addObserver(dashboard);

        System.out.println("Manual Input: ");
        station.performUpdate();


        System.out.println("\nReal time sensor: ");
        station.setUpdateStrategy(new RealTimeSensorUpdateStrategy());
        station.performUpdate();

        System.out.println("\nBatch update: ");
        station.setUpdateStrategy(new BatchUpdateStrategy(5));
        station.performUpdate();

        System.out.println("\nAfter removing phone: ");
        station.removeObserver(phone);
        station.performUpdate();
    }
}
