package practice_6.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Task_2 {

    public static void main(String[] args) {


        // реализуем коллекцию
        Queue <String> queueTask = new LinkedList<>();


        // добавляем в коллекцию задачи
        queueTask.offer("Задача 1");
        queueTask.offer("Задача 2");
        queueTask.offer("Задача 3");

        // работаем с очередью пока она не будет пуста
        while (!queueTask.isEmpty()){
            String actualTask = queueTask.poll();//удаляем первую задачу и возвращаем ее значение
            System.out.println(actualTask);// выводим каждую итерацию по задаче
        }








    }
}
