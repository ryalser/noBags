package patterns.factory_method.weapon;

public class WeaponFactory {

    public Weapon createWeapon(String type) {

        if (type.equals("Sword")) {
            return new Sword();
        } else if (type.equals("Onion")) {
            return new Onion();
        } else if (type.equals("Gun")) {
            return new Gun();
        }
        return null;
    }
}
