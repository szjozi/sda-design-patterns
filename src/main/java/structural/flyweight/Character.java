package structural.flyweight;

import java.util.Set;


public record Character(String characterName,
                        byte[] characterAvatar,
                        Set<String> skills) {

}
