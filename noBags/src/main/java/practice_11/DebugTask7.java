package practice_11;

/**
 *  Два потока списывают деньги со счёта одновременно, но почему-то баланс становится отрицательным.
 */

public class DebugTask7 {

    private static volatile int balance = 100;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> withdraw(60));
        Thread t2 = new Thread(() -> withdraw(50));
        t1.start();
        t2.start();
    }
    public static synchronized void  withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) { }
            balance -= amount;
            System.out.println("New balance: " + balance);
        }

        /**
         * Всего лишь добавил volatile к балансу,
         * чтобы данные переменной для потока всегда были актуальны.
         * А также указал метод как synchronized - только один поток может его использовать в единицу времени.
         */
    }
}
