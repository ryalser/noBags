package practice_9.task_1;

public class Main {

    public static void main(String[] args) {

        // Создаем экземпляр класса и через него вызываем старт потока
        OneThread oneThread = new OneThread();
        oneThread.thread.start();
    }

}
