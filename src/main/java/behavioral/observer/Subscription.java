package behavioral.observer;

public record Subscription(String email) implements Subscribable {

    @Override
    public void update() {
        System.out.println("Sending notification to email address: " + email);
    }
}
