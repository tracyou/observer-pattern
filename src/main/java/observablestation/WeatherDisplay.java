package observablestation;

public class WeatherDisplay implements Observer {
    private String name;

    private ObservableWeatherStation observableWeatherStation;

    public WeatherDisplay(String name) {
        this.name = name;
        this.observableWeatherStation = new ObservableWeatherStation();
    }

    @Override
    public void update() {
        this.display();
    }

    public void display(){
        System.out.println(name + " Current conditions: " + observableWeatherStation.checkSensors());
    }


}
