package patterns.factory_method.weapon;

public class Sword implements Weapon{

    @Override
    public void useWeapons(){
        System.out.println("Используем меч");
    }

    @Override
    public String name(){
        return "Меч";
    }
}
