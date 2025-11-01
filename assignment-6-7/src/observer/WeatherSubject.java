package observer;

public interface WeatherSubject {
    void addObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObservers();
}
