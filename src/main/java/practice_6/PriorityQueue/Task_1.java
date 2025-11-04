package practice_6.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task_1 {

    public static void main(String[] args) {


        // реализуем очередь через PriorityQueue(приоритетная очередь)
        Queue <Integer> queueNumber = new PriorityQueue<>();


        // добавляем значения
        queueNumber.offer(1);
        queueNumber.offer(3);
        queueNumber.offer(2);
        queueNumber.offer(7);
        queueNumber.offer(0);



        // пока очередь не пустая - удалить по порядку каждый элемент
        while (!queueNumber.isEmpty()){
            System.out.println(queueNumber.poll());
        }

    }

}
