package patterns.builder.online_store;

public class OrderBuilder {

    // Переменная хранит заказ
    private Order order;

    // При вызове строителя заказа - создаем новый Order
    public OrderBuilder(){
        this.order = new Order();
    }

    // Добавить товар в заказ
    public OrderBuilder addItem(String item){
        order.getItems().add(item);
        return this;
    }

    // Добавить скидку
    public OrderBuilder setDiscount(double discount){
        order.setDiscount(10);
        return this;
    }

    // Добавить способ оплаты
    public OrderBuilder setPaymentMethod(String paymentMethod){
        order.setPaymentMethod(paymentMethod);
        return this;
    }

    // Добавить адрес доставки
    public OrderBuilder setShippingAddress(String shippingAddress){
        order.setShippingAddress(shippingAddress);
        return this;
    }

    // Вернуть заказ
    public Order build(){
        return order;
    }
}
