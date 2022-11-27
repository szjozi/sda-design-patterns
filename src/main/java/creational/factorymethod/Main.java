package creational.factorymethod;

public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.orderCar(CarType.US_CAR);
        car1.assemble();

        Car car2 = carFactory.orderCar(CarType.EU_CAR);
        car2.assemble();

    }
}
