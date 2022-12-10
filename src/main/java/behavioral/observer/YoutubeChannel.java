package behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class YoutubeChannel implements Observable {

    private final Set<Subscribable> subscribers;

    public YoutubeChannel() {
        this.subscribers = new HashSet<>();
    }

    public void addNewVideo() {
        System.out.println("New video added.");
        notifySubscribers();
    }

    @Override
    public void subscribe(Subscribable subscribable) {
        subscribers.add(subscribable);
        System.out.println("Subscription added: " + subscribable.toString());
    }

    @Override
    public void unsubscribe(Subscribable subscribable) {
        subscribers.remove(subscribable);
        System.out.println("Subscription removed: " + subscribable.toString());
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Subscribable::update);
    }
}
