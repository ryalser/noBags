package mock;

public class CinemaTicket extends Ticket {


    private String name;
    private double price;
    private String location;

    public CinemaTicket(String name, double price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price / 0.5;
    }

    public String getLocation() {
        return location;
    }

    @Override
    void printInfo() {
        System.out.println("Информация о билете: " + getName() + ", цена: " + getPrice());
    }
}
