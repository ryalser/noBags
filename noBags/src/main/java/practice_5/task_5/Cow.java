package practice_5.task_5;

public class Cow extends FarmAnimal {

    public Cow(){
        super("Корова");
    }

    @Override
    void getResource(){
        System.out.println("даёт молоко");
    }

    @Override
    void toLookAfter(){
        System.out.println("Пасем корову");
    }
}
