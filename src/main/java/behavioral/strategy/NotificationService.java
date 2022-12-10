package behavioral.strategy;

public class NotificationService {

    private Notifier notifier;

    public void sendNotification(){
        notifier.sendNotification();
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
}
