package practice_5.task_3;

public class Drink extends Dish {

    private double volume;

    public Drink(String name, double volume){
        super(name);
        this.volume = volume;
    }


    @Override
    public void printInfo(){
        System.out.println("Напиток: " + getName() +
                ", объем: " + volume);
    }
}
