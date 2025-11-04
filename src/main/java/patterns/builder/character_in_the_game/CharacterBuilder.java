package patterns.builder.character_in_the_game;

public class CharacterBuilder {

    // Храним персонажа
    private Character character;

    // По умолчанию, если вызываем строителя персонажа - создаем дефолтный его конструктор
    public CharacterBuilder() {
        this.character = new Character();
    }

    // Установить имя персонажа
    public CharacterBuilder setName(String name) {
        character.setName(name);
        return this;
    }

    // Установить здоровье персонажа
    public CharacterBuilder setHealth(int health) {
        character.setHealth(health);
        return this;
    }

    // Установить урон персонажа
    public CharacterBuilder setDamage(int damage) {
        character.setDamage(damage);
        return this;
    }

    // Установить уровень магии
    public CharacterBuilder setMagic(int magic) {
        character.setMagic(magic);
        return this;
    }

    public Character buildCharacter() {
        return character;
    }
}
