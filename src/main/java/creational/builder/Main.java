package creational.builder;

public class Main {

    public static void main(String[] args) {

        Sandwich sandwich = Sandwich.builder()
                .ham(true)
                .cheese(true)
                .topping(true)
                .build();

        System.out.println(sandwich);
    }
}
