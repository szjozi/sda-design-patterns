package creational.singleton;


public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

/*

    Ternary Operator:

    public static LazySingleton getInstance() {
        return instance == null ? new LazySingleton() : instance;
    }

*/
}
