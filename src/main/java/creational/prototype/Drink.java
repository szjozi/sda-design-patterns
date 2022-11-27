package creational.prototype;


import java.util.UUID;

public class Drink extends Product {

    public Drink(UUID id, String name) {
        super(id, name);
    }

    public Drink(Drink drink) {
        super(drink);
    }

    @Override
    public Product clone() {
        return new Drink(this);
    }

    @Override
    public String toString() {
        return "Drink(" + super.getId() + ", name='" + super.getName() + ")";
    }
}