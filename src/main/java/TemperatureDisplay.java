public class TemperatureDisplay implements Observer,Display {
    private int temperature;

    @Override
    public void display() {
        System.out.println("Temerature is"+ temperature);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        display();
    }
}
