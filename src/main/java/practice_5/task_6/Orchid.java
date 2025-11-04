package practice_5.task_6;

public class Orchid extends Plant {

    public Orchid (){
        super("Орхидея");
    }

    @Override
    void toLookAfter(){
        System.out.println("Поставить во влажном помещение в тень");
    }
}
