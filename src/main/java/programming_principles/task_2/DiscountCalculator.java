package programming_principles.task_2;

public class DiscountCalculator {


    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;

        // Уберем вложенные условия и запишем более читаемую логику применения скидок
        if (isLoyalCustomer && isFirstPurchase) {
            discount = price * 0.1;
        } else if (isLoyalCustomer) {
            discount = price * 0.05;
        } else if (hasCoupon) {
            discount = price * 0.07;
        } else {
            discount = price * 0.02;
        }
        return price - discount;
    }
}