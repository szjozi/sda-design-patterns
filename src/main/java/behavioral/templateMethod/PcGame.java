package behavioral.templateMethod;

public class PcGame extends GamePlayTemplate {

    @Override
    public void initGame() {
        System.out.println("Initializing PC game.");
    }

    @Override
    public void startGame() {
        System.out.println("Starting PC game.");
    }

    @Override
    public void endGame() {
        System.out.println("Ending PC game.");
    }

}
