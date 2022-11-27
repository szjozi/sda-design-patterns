package creational.singleton;

public class BillPughSingleton {

    private String name;

    private BillPughSingleton() {
    }

    private static class Singleton {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

     public static BillPughSingleton getInstance() {
        return Singleton.INSTANCE;
    }

}
