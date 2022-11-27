package creational.prototype;


import java.util.UUID;

public class Phone extends Product {

    private String model;

    public Phone(UUID id, String name) {
        super(id, name);
    }

    public Phone(Phone phone) {
        super(phone);
        this.model = phone.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Product clone() {
        return new Phone(this);
    }


    @Override
    public String toString() {
        return "Phone(" + super.getId() + ", name='" + super.getName() + ", model='" + model + ")";
    }
}