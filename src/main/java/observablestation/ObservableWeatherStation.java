package observablestation;

import sensors.*;

import java.util.ArrayList;
import java.util.List;

public class ObservableWeatherStation implements Subject{

    private List<Sensor> sensors;
    private List<WeatherDisplay> observers;


    public ObservableWeatherStation() {
        this.sensors = new ArrayList<>();
        sensors.add(new RainGauge());
        sensors.add(new Thermometer());
        sensors.add (new Hygrometer());
        sensors.add (new Anemometer());

        this.observers = new ArrayList<>();
    }

    public String checkSensors(){
        StringBuilder sb = new StringBuilder();
        for (Sensor s: sensors) {
            s.takeMeasurement();
            sb.append("\n");
            sb.append(s);
        }
        notifyObserver();
        return sb.toString();
    }

    @Override
    public void registerObserver(WeatherDisplay display) {
        observers.add(display);
    }

    @Override
    public void removeObserver(WeatherDisplay display) {
        observers.remove(display);
    }

    @Override
    public void notifyObserver() {
        for (WeatherDisplay display:observers) {
            display.update();
        }
    }

    public Integer getNumberOfObservers() {
        return observers.size();
    }
}
