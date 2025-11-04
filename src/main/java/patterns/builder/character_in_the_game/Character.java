package patterns.builder.character_in_the_game;

public class Character {

    private String name;
    private int health;
    private int damage;
    private int magic;


    protected Character() {
        this.name = "USERNAME";
        this.damage = 0;
        this.health = 0;
        this.magic = 0;
    }


    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getMagic() {
        return magic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }


    // Показать информацию о персонаже
    public void displayInfo() {
        System.out.println("ИНФО О ПЕРСОНАЖЕ:");
        System.out.println("Имя персонажа: " + name);
        System.out.println("Уровень здоровья: " + health);
        System.out.println("Уровень урона: " + damage);
        System.out.println("Уровень магии: " + magic);
    }
}
