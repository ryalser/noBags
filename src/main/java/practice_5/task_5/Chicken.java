package practice_5.task_5;

public class Chicken extends FarmAnimal {

    public Chicken(){
        super("Курица");
    }

    @Override
    void getResource(){
        System.out.println("несёт яйца");
    }

    @Override
    void toLookAfter(){
        System.out.println("Дать зерна");
    }
}
