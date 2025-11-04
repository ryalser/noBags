package patterns.factory_method.transport;

public class Car implements Transport {

    @Override
    public void deliver() {
        System.out.println("Доставка автомобилем");
    }

    @Override
    public String type() {
        return "Автомобиль";
    }
}
