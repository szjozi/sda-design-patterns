package structural.decorator;


public class Main {

    public static void main(String[] args) {

        System.out.println();
        BasicCar basicCar = new BasicCar("Mercedes", "CLS");
        basicCar.assemble();
        System.out.println("Car setup: " + basicCar + "\n=======================");

        SportPackageDecorator sportPackage = new SportPackageDecorator(basicCar, true, true);
        sportPackage.assemble();
        System.out.println("Car setup: " + sportPackage + "\n=======================");

        WinterPackageDecorator winterPackage = new WinterPackageDecorator(basicCar, true);
        winterPackage.assemble();
        System.out.println("Car setup: " + winterPackage + "\n=======================");

        SportPackageDecorator sportPackageAndWinterPackage = new SportPackageDecorator(winterPackage, true, true);
        sportPackageAndWinterPackage.assemble();
        System.out.println("Car setup: " + sportPackageAndWinterPackage);
    }
}
