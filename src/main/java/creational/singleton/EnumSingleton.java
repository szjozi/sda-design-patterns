package creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
