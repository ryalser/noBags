package programming_principles.task_5;

public class Cryptocurrency implements Payment {
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
