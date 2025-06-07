package practice_2;

public class Product {

    String name;
    double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }


    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }


    //Вычисление цены со скидкой
    public double applyDiscount(double discount){
        return price -= price * (discount / 100);
    }

    void printInfo(){
        System.out.println("Товар: " + name + ", цена: " + price);
    }

}
