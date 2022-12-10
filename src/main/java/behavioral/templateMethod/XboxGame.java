package behavioral.templateMethod;

public class XboxGame extends GamePlayTemplate {

    @Override
    public void initGame() {
        System.out.println("Initializing Xbox game.");
    }

    @Override
    public void startGame() {
        System.out.println("Starting Xbox game.");
    }

    @Override
    public void endGame() {
        System.out.println("Ending Xbox game.");
    }
}
