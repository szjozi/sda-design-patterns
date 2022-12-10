package structural.flyweight;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CharactersService {

    private final Map<String, Character> characters;

    public CharactersService() {
        this.characters = new HashMap<>();
    }

    public Character getCharacter(String characterName) {

        Character character = characters.get(characterName);

        if (character == null) {
            System.out.println("Adding character to cache");

            byte[] avatar = "Character Avatar".getBytes();

            Set<String> skills = new HashSet<>();
            skills.add("strength");
            skills.add("speed");
            skills.add("health");

            character = new Character(characterName, avatar, skills);
            characters.put(characterName, character);

        } else {
            System.out.println("Using character.");
        }
        return character;
    }
}
