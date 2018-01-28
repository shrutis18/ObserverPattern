public class Main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();


        TemperatureDisplay td = new TemperatureDisplay();
        HumidityDisplay hd = new HumidityDisplay();
        wd.registerObserver(td);
        wd.registerObserver(hd);
        wd.measurementChanged(10,20);
        wd.measurementChanged(30,40);
    }
}
