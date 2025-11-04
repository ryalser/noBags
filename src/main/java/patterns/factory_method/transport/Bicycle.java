package patterns.factory_method.transport;

public class Bicycle implements Transport {

    @Override
    public void deliver() {
        System.out.println("Доставка велосипедом");
    }

    @Override
    public String type() {
        return "Велосипед";
    }


}
