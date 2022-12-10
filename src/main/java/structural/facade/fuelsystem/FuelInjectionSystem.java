package structural.facade.fuelsystem;

public record FuelInjectionSystem(FuelPump fuelPump) {

    public void start() {
        fuelPump.on();
        System.out.println("Pumping fuel");
        fuelPump.off();
        System.out.println("Fuel injection started.");
    }

    public void stop() {
        System.out.println("Fuel injection stopped.");
    }
}
