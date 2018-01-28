public class HumidityDisplay implements Observer,Display {
    private int humidity;

    @Override
    public void display() {
        System.out.println("Humidity is"+humidity);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.humidity = humidity;
        display();
    }
}
