package structural.facade;

import structural.facade.coolingsystem.CoolingController;
import structural.facade.coolingsystem.Radiator;
import structural.facade.coolingsystem.TemperatureSensor;
import structural.facade.fuelsystem.FuelInjectionSystem;
import structural.facade.fuelsystem.FuelPump;
import structural.facade.ignitionsystem.Starter;

public class CarEngineFacade  {

    private final Starter starter = new Starter();
    private final Radiator radiator = new Radiator();

    private final FuelPump fuelPump = new FuelPump();
    private final FuelInjectionSystem fuelInjector = new FuelInjectionSystem(fuelPump);

    private final TemperatureSensor temperatureSensor = new TemperatureSensor();
    private final CoolingController coolingController = new CoolingController(radiator, temperatureSensor);


    public void start(){
        System.out.println("STARTING CAR ENGINE");
        starter.on();
        fuelInjector.start();
        starter.off();

        coolingController.on();

        coolingController.getCurrentTemperature();
        System.out.println("Temperature to high");

        coolingController.cool();

        coolingController.getCurrentTemperature();
        System.out.println("Temperature ok");

        coolingController.stopColling();
        System.out.println(".........");
    }

    public void stop() {
        System.out.println("STOPING CAR ENGINE");
        fuelPump.off();
        fuelInjector.stop();
        coolingController.off();
        System.out.println(".........");
    }

}
