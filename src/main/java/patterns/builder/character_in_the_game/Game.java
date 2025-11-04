package patterns.builder.character_in_the_game;

public class Game {
    // Создать персонажа в игре
    public Character createCharacter(CharacterBuilder characterBuilder){
        return characterBuilder.buildCharacter();
    }
}
