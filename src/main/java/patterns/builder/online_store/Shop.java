package patterns.builder.online_store;

public class Shop {
    // Создать заказ
    public Order createOrder(OrderBuilder orderBuilder){
        return orderBuilder.build();
    }
}
