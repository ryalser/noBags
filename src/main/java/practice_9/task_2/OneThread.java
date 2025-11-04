package practice_9.task_2;

public class OneThread implements Runnable{

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Поток прерван");
                }
            }
        }
    }


// По итогам проверки перенес блок try-catch в сам цикл.
 




