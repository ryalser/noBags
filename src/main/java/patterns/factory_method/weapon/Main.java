package patterns.factory_method.weapon;

public class Main {
    public static void main(String[] args) {

        // Создаем фабрику
        WeaponFactory weaponFactory = new WeaponFactory();

        // Создаем оружие и используем его
        Weapon gun = weaponFactory.createWeapon("Gun");
        System.out.println("Мы создали оружие: " + gun.name());
        gun.useWeapons();
    }
}
