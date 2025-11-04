package practice_5.task_2;

public class Dog extends Pet{

    @Override
    public void interact(){
        System.out.println("Гулять с собакой");
    }

    @Override
    public void feed(){
        System.out.println("Кормить сухим кормом");
    }
}
