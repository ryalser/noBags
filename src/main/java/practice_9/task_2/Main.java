package practice_9.task_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {


        // Создаем пул потоков (2)
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Вызываем первый поток
        executorService.execute(new OneThread());
        // Вызываем второй поток
        executorService.execute(new TwoThread());

        // Завершаем пул потоков
        executorService.shutdown();
    }

}
