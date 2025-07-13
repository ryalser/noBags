package practice_5.task_6;

public class Cactus extends Plant {

    public Cactus(){
        super("Кактус");
    }

    @Override
    void toLookAfter(){
        System.out.println("Поставить на свет и полить цветок");
    }
}
