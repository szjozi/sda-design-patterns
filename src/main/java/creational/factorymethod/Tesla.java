package creational.factorymethod;

public class Tesla implements Car {

    private final CarType carType;

    public Tesla() {
        this.carType = CarType.US_CAR;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling car: " + this);
    }

    @Override
    public String toString() {
        return "Tesla{ carType=" + carType + '}';
    }
}
