package structural.adapter;


public class Main {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();
        MphSpeedAdapter speedAdapter = new MphSpeedAdapter(mercedes);

        double initialSpeed = 20.00;

        for (int i = 0; i < 3; i++) {

            mercedes.setSpeed(initialSpeed * i);

            System.out.printf("Original speed: %.2f km/h\n", mercedes.getKmSpeed());
            System.out.printf("Converted speed: %.2f mph\n\n", speedAdapter.getMphSpeed());
        }
    }
}
