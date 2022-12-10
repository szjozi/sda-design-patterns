package behavioral.templateMethod;

public abstract class GamePlayTemplate {

    public abstract void initGame();
    public abstract void startGame();
    public abstract void endGame();

    // Please note that template method must be final
    public final void play() {
        initGame();
        startGame();
        endGame();
    }

}
