package behavioral.strategy;

public class SmsNotification implements Notifier {

    @Override
    public void sendNotification() {
        System.out.println("Sending sms notification");
    }
}
