package creational.factorymethod;

public class Mercedes implements Car {

    private final CarType carType;

    public Mercedes() {
        this.carType = CarType.EU_CAR;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling car: " + this);
    }

    @Override
    public String toString() {
        return "Mercedes{ carType=" + carType + '}';
    }
}