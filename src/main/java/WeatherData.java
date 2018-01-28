import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    private int temperature;
    private int humidity;
    private List<Observer> observers;


    public WeatherData() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature,humidity));
    }

    public void measurementChanged(int temp, int humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        notifyObservers();
    }
}
