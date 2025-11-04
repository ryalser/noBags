package practice_6.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {

    public static void main(String[] args) {



            // создаем коллекцию
            List<Integer> num = new ArrayList<>();

            // добавляем значения
            num.add(1);
            num.add(2);
            num.add(3);
            num.add(5);
            num.add(6);

            num.add(120);


            // вариант вывода с помощью цикла
            for (Integer number : num) {

                if (number % 2 == 0) {
                    System.out.println(number);
                }


            }
        }

    }


