package patterns.factory_method.weapon;

public class Onion implements Weapon{

    @Override
    public void useWeapons(){
        System.out.println("Используем лук");
    }

    @Override
    public String name(){
        return "Лук";
    }
}
