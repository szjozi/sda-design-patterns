package creational.prototype;


import java.util.UUID;

public abstract class Product implements Cloneable {

    private UUID id;
    private final String name;

    public Product(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
    }

    public abstract Product clone();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product(id=" + id +", name='" + name + ")";
    }
}
