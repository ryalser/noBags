package patterns.builder.online_store;


// 1. ✅ СОЗДАТЬ КЛАСС ORDER (ЗАКАЗ)
//    - private List<String> items (список товаров)
//    - private double discount (скидка)
//    - private String paymentMethod (способ оплаты)
//    - private String shippingAddress (адрес доставки)
//    - Конструктор Order() с инициализацией
//    - Геттеры для всех полей (getItems(), getDiscount() и т.д.)
//    - Метод displayOrder() для красивого вывода
//
// 2. ✅ СОЗДАТЬ КЛАСС ORDERBUILDER (СТРОИТЕЛЬ)
//    - private Order order (собираемый заказ)
//    - Конструктор OrderBuilder() с созданием нового Order
//    - Метод addItem(String item) с return this
//    - Метод setDiscount(double discount) с return this
//    - Метод setPaymentMethod(String method) с return this
//    - Метод setShippingAddress(String address) с return this
//    - Финальный метод build() который возвращает Order
//
// 3. ✅ СОЗДАТЬ КЛАСС SHOP (МАГАЗИН)
//    - Метод createOrder(OrderBuilder builder)
//    - Внутри просто вызываем builder.build()
//
//
//  MAIN КЛАСС ДЛЯ ТЕСТИРОВАНИЯ:
//    - OrderBuilder builder = new OrderBuilder()
//    - Цепочка вызовов: addItem().setDiscount().setPaymentMethod()...
//    - Shop shop = new Shop()
//    - Order order = shop.createOrder(builder)
//    - order.displayOrder()