package behavioral.strategy;

public class EmailNotification implements Notifier {

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification");
    }
}
