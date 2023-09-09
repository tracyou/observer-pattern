package observablestation;
public interface Subject {
    //TODO add the methods that you might require
    void registerObserver(WeatherDisplay display);
    void removeObserver(WeatherDisplay display);
    void notifyObserver();
    }
