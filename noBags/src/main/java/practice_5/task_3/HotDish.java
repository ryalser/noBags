package practice_5.task_3;

public class HotDish extends Dish {

    private int temperature;

    public HotDish(String name, int temperature){
        super(name);
        this.temperature = temperature;

    }

    @Override
    public void printInfo(){
        System.out.println("Горячее блюдо: " + getName() +
        ", температура: " + temperature);
    }


}
