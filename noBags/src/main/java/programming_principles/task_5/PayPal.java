package programming_principles.task_5;

public class PayPal implements Payment {
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
