package patterns.factory_method.weapon;

public class Gun implements Weapon{

    @Override
    public void useWeapons(){
        System.out.println("Используем пистолет");
    }

    @Override
    public String name(){
        return "Пистолет";
    }
}
