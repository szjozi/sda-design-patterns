package structural.facade.coolingsystem;

public class TemperatureSensor {

    public void on() {
        System.out.println("Temperature sensor on");
    }

    public void off() {
        System.out.println("Temperature sensor off");
    }

    public void getTemperature() {
        System.out.println("Getting coolant temperature");
    }

}
