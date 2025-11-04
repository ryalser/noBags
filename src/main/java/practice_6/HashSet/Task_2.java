package practice_6.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Task_2 {


    public static void main(String[] args) {



        // реализуем базовый интерфейс Set с помощью HashSet
        Set<Integer> num = new HashSet<>();

        // добавляем элементы
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);


        boolean isNumber5 = false;

        if (num.contains(5)){
            isNumber5 = true;
            System.out.println("Содержит ли коллекция число 5 - " + isNumber5);
        } else {
            System.out.println("Содержит ли коллекция число 5 - " + isNumber5);
        }


    }


    }

