package practice_9.task_3;

public class NewThread extends Thread {

volatile boolean isRunning = true; // Переменная, значение которой всегда пишется в постоянную память, а не кэш потока
    int counter; // Счетчик

    @Override
    public void run() {
        while (isRunning) {
            System.out.println(counter);
            counter++;
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }





