package structural.decorator;


public record BasicCar(String make, String model) implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling basic car");
    }
}
