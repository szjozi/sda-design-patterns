package structural.decorator;


public class WinterPackageDecorator extends CarDecorator {

    private final boolean heatedSeats;

    public WinterPackageDecorator(Car car, boolean heatedSeats) {
        super(car);
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding winter package");
    }

    @Override
    public String toString() {
        return super.toString() + " WinterPackageDecorator[heatedSeats=" + heatedSeats + ']';
    }
}
