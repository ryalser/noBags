package practice_6.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {

        // создаем коллекцию
        List <Integer> num = new ArrayList<>();

        // добавляем значения
        num.add(1);
        num.add(2);
        num.add(3);

        num.add(120);


        // выводим в консоль коллекцию
        System.out.println(num);

        // вариант вывода с помощью цикла
        for (Integer number : num){
            System.out.println(number);
        }




    }





}
