package practice_5.task_2;

public class Cat extends Pet{

    @Override
    public void interact(){
        System.out.println("Играть с кошкой");
    }

    @Override
    public void feed(){
        System.out.println("Кормить влажным кормом");
    }
}
