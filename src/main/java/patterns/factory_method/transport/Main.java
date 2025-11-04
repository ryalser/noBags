package patterns.factory_method.transport;

public class Main {
    public static void main(String[] args) {

        // Создаем фабрику
        TransportFactory transportFactory = new TransportFactory();

        // Создаем автомобиль
        Transport car = transportFactory.createTransport("car");
        System.out.println("Мы создали: " + car.type());
        car.deliver();
    }
}
