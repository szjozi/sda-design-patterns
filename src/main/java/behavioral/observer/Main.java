package behavioral.observer;

public class Main {

    public static void main(String[] args) {

        Subscription subscriber1 = new Subscription("example1@email.com");
        Subscription subscriber2 = new Subscription("example2@email.com");
        Subscription subscriber3 = new Subscription("example3@email.com");

        YoutubeChannel channel = new YoutubeChannel();
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        System.out.println("=====================");
        channel.addNewVideo();

        System.out.println("=====================");
        channel.unsubscribe(subscriber3);

        System.out.println("=====================");
        channel.addNewVideo();
    }
}
