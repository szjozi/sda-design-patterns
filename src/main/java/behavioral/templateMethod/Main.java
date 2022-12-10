package behavioral.templateMethod;

public class Main {

    public static void main(String[] args) {
        XboxGame xboxGame = new XboxGame();
        xboxGame.play();

        System.out.println("===============================");

        PcGame pcGame = new PcGame();
        pcGame.play();
    }
}
