package structural.flyweight;

public class Main {

    public static void main(String[] args) {

        CharactersService charactersFactory = new CharactersService();
        Character geraltOfRivia = charactersFactory.getCharacter("Geralt of Rivia");

        Player player1 = new Player("player1", geraltOfRivia);
        geraltOfRivia = charactersFactory.getCharacter("Geralt of Rivia");

        Player player2 = new Player("player2", geraltOfRivia);

        geraltOfRivia = charactersFactory.getCharacter("Geralt of Rivia");
        Player player3 = new Player("player3", geraltOfRivia);

        System.out.println("Player nickname: " + player1.nickname() + " character hashcode: " + player1.character().hashCode());
        System.out.println("Player nickname: " + player2.nickname() + " character hashcode: " + player2.character().hashCode());
        System.out.println("Player nickname: " + player3.nickname() + " character hashcode: " + player3.character().hashCode());
    }
}
