package programming_principles.task_5;

public class CreditCart implements Payment {
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
