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
        System.out.println("Стоимость " +  this.name + " - " + this.price);
        return this.price;
    }

    void setPrice(double newPrice){
        if(newPrice <= 0){
            throw new IllegalArgumentException("Цена не может быть меньше или равна 0!");

        }
        this.price = newPrice;
    }


    //Вычисление цены со скидкой
    public double applyDiscount(double discount){
        if(discount <= 0 || discount > 100){
            throw new IllegalArgumentException("Скидка должна быть в диапазоне от 0 до 100%!");

        }
        this.price -= price * (discount / 100);
        return this.price;
    }

    void printInfo(){
        System.out.println("Товар: " + name + ", цена: " + price);
    }

}
