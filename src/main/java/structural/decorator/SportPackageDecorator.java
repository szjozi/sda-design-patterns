package structural.decorator;



public class SportPackageDecorator extends CarDecorator {

    private final boolean sportSeats;
    private final boolean sportExhaust;

    public SportPackageDecorator(Car car, boolean sportSeats, boolean sportExhaust) {
        super(car);
        this.sportSeats = sportSeats;
        this.sportExhaust = sportExhaust;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sport package");
    }

    @Override
    public String toString() {
        return super.toString() + " SportPackageDecorator[sportSeats=" + sportSeats + ", sportExhaust=" + sportExhaust + ']';
    }
}
