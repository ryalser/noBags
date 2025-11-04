package patterns.builder.online_store;

public class Main {
    public static void main(String[] args) {

        // Создаем сборщик заказа
        OrderBuilder orderBuilder = new OrderBuilder();

        orderBuilder.addItem("Молоко")
                .setDiscount(10)
                .setPaymentMethod("СБП")
                .setShippingAddress("Проспект революции,1")
                .build();


        // Магазин создает заказ
        Shop shop = new Shop();

        // Демонстрировать детали заказа
        Order order = shop.createOrder(orderBuilder);
        order.displayOrder();
    }
}
