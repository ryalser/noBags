package practice_9.task_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter {

    static int count = 0;// Счетчик

    // Метод добавляет счетчику +1 и выводит значение счетчика актуальное
    public static synchronized void  increment(){
        count++;
        System.out.println(count);
    }




    public static void main(String[] args) throws InterruptedException {

        // Первый поток с циклом на 1000 итераций, вызывающий increment()
        Thread threadOne = new Thread(() -> {
        for (int i = 1; i <= 1000; i++){
            Counter.increment();
            }
        }
        );


        // Второй поток с циклом на 1000 итераций, вызывающий increment()
        Thread threadTwo = new Thread(()->{
            for (int i = 1; i <= 1000; i++){
                Counter.increment();
            }
        });


        // Старт потоков
        threadOne.start();
        threadTwo.start();

        // Ожидание потоков, но здесь оно вероятно не нужно
        threadOne.join();
        threadTwo.join();

    }
}
