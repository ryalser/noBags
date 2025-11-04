package practice_6.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Task_1 {

    public static void main(String[] args) {


        // реализуем базовый интерфейс Set через TreeSet
        Set<Integer> num = new TreeSet<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);


        System.out.println(num);


    }

}
