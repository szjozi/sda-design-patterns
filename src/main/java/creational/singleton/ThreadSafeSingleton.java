package creational.singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Illegal reflection access!");
        }
    }

    public static ThreadSafeSingleton getInstance() {

        ThreadSafeSingleton result = instance;

        if (result == null) {
            synchronized (ThreadSafeSingleton.class) {
                result = instance;
                if (result == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return result;
    }
}
