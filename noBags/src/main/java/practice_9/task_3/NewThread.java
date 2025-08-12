package practice_9.task_3;

public class NewThread extends Thread {

    volatile boolean stop = true; // Переменная, значение которой всегда пишется в постоянную память, а не кэш потока
    int counter; // Счетчик

    @Override
    public void run() {
        while (stop) {
            System.out.println(counter);
            counter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException("поток прерван");
            }
        }
    }
}





