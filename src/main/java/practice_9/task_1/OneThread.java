package practice_9.task_1;

public class OneThread {

    // Создаем поток
    Thread thread = new Thread(){

        // Переопределяем метод run, который вызывается при thread.start()
        @Override
        public void run(){

            // 5 раз выводим сообщение
                for (int i = 1; i <=5 ; i++){
                    System.out.println("Привет из потока!");

                    // Поток засыпает 5 раз на 1сек = 1000мс
                    try {
                        Thread.sleep(1000);
                        // Выбросим исключение при прерывании потока
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        }
    };
}
