package observablestation;

public interface Subject {
    void registerObserver(WeatherDisplay display);

    void removeObserver(WeatherDisplay display);

    void notifyObserver();
}
