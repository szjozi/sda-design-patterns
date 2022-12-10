package behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        NotificationType[] notificationTypes = NotificationType.values();
        NotificationService notificationService = new NotificationService();

        for (NotificationType notificationType : notificationTypes) {
            switch (notificationType) {
                case SMS -> {
                    System.out.println("===================\nSMS:");
                    sendNotification(notificationService, new SmsNotification());
                }
                case EMAIL -> {
                    System.out.println("===================\nEMAIL:");
                    sendNotification(notificationService, new EmailNotification());
                }
                case SLACK -> {
                    System.out.println("===================\nSLACK:");
                    sendNotification(notificationService, new SlackNotification());
                }
                case SMS_AND_EMAIL -> {
                    System.out.println("===================\nSMS_AND_EMAIL:");
                    sendNotification(notificationService, new SmsNotification());
                    sendNotification(notificationService, new EmailNotification());
                }
                case ALL -> {
                    System.out.println("===================\nALL:");
                    sendNotification(notificationService, new SmsNotification());
                    sendNotification(notificationService, new EmailNotification());
                    sendNotification(notificationService, new SlackNotification());
                }
            }
        }
    }

    private static void sendNotification(NotificationService notificationService, Notifier notifier) {
        notificationService.setNotifier(notifier);
        notificationService.sendNotification();
    }
}
