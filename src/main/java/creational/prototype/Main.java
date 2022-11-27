package creational.prototype;

import java.util.Map;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        ProductsRegister productsRegister = new ProductsRegister();
        Map<ProductType, Product> productsCache = productsRegister.getRegistry();

        Product redBull = productsCache.get(ProductType.RED_BULL);

        for (int i = 0; i < 5; i++) {

            Product clone = redBull.clone();
            clone.setId(UUID.randomUUID());

            System.out.println(clone);
        }


        String[] models = {"3GS", "7", "7 Plus", "X", "11", "12", "13",};
        Product iphone = productsCache.get(ProductType.IPHONE);

        for (String model : models) {
            Phone clone = (Phone) iphone.clone();
            clone.setId(UUID.randomUUID());
            clone.setModel(model);

            System.out.println(clone);
        }
    }
}
