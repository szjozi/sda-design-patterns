package structural.facade;

public class Main {

    public static void main(String[] args) {

        CarEngineFacade carEngine = new CarEngineFacade();
        carEngine.start();

        System.out.println("=====================\n");
        carEngine.stop();
    }
}
