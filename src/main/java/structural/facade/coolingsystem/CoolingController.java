package structural.facade.coolingsystem;

public record CoolingController(Radiator radiator, TemperatureSensor temperatureSensor) {

    public void on() {
        System.out.println("Cooling controller on");
        temperatureSensor.on();
    }

    public void off() {
        temperatureSensor.off();
        System.out.println("Cooling controller off");
    }

    public void getCurrentTemperature() {
        System.out.println("Checking coolant temperature");
        temperatureSensor.getTemperature();
    }

    public void cool() {
        radiator.on();
        radiator.setSpeed();
        System.out.println("Cooling started");
    }

    public void stopColling() {
        radiator.off();
        System.out.println("Cooling stopped");
    }
}
