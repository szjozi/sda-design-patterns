package behavioral.observer;

public interface Observable {

    void subscribe(Subscribable subscribable);

    void unsubscribe(Subscribable subscribable);

    void notifySubscribers();

}
