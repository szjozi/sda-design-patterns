package creational.prototype;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductsRegister {

    private final Map<ProductType, Product> registry;

    public ProductsRegister() {
        this.registry = new HashMap<>();
        this.initRegistry();
    }

    public Map<ProductType, Product> getRegistry() {
        return registry;
    }

    public void initRegistry() {

        Product redBull = new Drink(UUID.randomUUID(), "RedBull");
        Product iphone = new Phone(UUID.randomUUID(), "IPhone");

        registry.put(ProductType.RED_BULL, redBull);
        registry.put(ProductType.IPHONE, iphone);
    }
}