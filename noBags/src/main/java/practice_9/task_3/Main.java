package practice_9.task_3;

public class Main  {
    public static void main(String[] args) throws InterruptedException {

        // Создаем экземпляр класса
        NewThread newThread = new NewThread();
            newThread.start(); // Запускаем поток

         try {
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }

            // Ставим флаг остановки
            newThread.stop = false;
        }
    }

/*
    Печатаем:
0
1
2
3
4
5
6
7
8
9
--ОСТАНАВЛИВАЕМСЯ ЧЕРЕЗ 2 СЕКУНДЫ--


 */

