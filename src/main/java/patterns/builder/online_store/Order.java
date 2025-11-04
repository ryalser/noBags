package patterns.builder.online_store;

import java.util.ArrayList;
import java.util.List;

public class Order {

    // Список товаров
    private List<String> items;

    // Прочие характеристики
    private double discount;
    private String paymentMethod;
    private String shippingAddress;


    // Конструктор при создании заказа
    public Order() {
        this.items = new ArrayList<>();
        this.discount = 0.0;
    }


    // Геттеры и сеттеры
    public double getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    // Получить товары
    public List<String> getItems() {
        return items;
    }


    // Получить информацию о заказе
    public void displayOrder() {
        System.out.println("ЗАКАЗ:");
        System.out.println("Товары: " + items);
        System.out.println("Cкидка: " + discount);
        System.out.println("Способ оплаты: " + paymentMethod);
        System.out.println("Адрес доставки: " + shippingAddress);
    }
}
