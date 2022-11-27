package creational.factorymethod;

public class CarFactory {

    public Car orderCar(CarType carType) {
        switch (carType) {
            case US_CAR:
                return new Tesla();
            case EU_CAR:
                return new Mercedes();
        }
        throw new IllegalArgumentException("Car type not supported");
    }
}
