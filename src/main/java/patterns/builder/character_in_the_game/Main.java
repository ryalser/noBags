package patterns.builder.character_in_the_game;

public class Main {
    public static void main(String[] args) {

        // Создаем строитель персонажа
        CharacterBuilder characterBuilder = new CharacterBuilder();
        // Обращаясь к строителю, указываем характеристики персонажа
        characterBuilder.setName("Arthas")
                .setHealth(100)
                .setDamage(90)
                .setMagic(78)
                .buildCharacter();


        // Создаем экземпляр класса Игры, которая имеет метод создания персонажа
        Game game = new Game();

        //Создаем персонажа (все равно, что нажать кнопку "Создать" в игре)
        // и присваиваем ему результат вызова метода createCharacter из класса Game
        Character arthas = game.createCharacter(characterBuilder);
        arthas.displayInfo();
    }
}
