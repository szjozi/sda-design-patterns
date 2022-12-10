package behavioral.strategy;

public class SlackNotification implements Notifier {

    @Override
    public void sendNotification() {
        System.out.println("Sending notification to slack channel.");
    }
}
