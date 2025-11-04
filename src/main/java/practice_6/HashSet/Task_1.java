package practice_6.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Task_1 {

    public static void main(String[] args) {


        // реализуем базовый интерфейс Set с помощью HashSet
        Set <Integer> num = new HashSet<>();

        // добавляем элементы
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);


    }
}
