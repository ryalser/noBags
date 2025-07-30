package practice_6.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {

    public static void main(String[] args) {


        // реализуем Map через HashMap
        Map<String, Integer> name = new HashMap<>();


        // добавляем пары ключ-значение
        name.put("Ivan",15);
        name.put("Sergey",22);
        name.put("Sasha",25);
        name.put("Petr",63);
        name.put("Victor",44);



        // выводим true если есть такое имя
        System.out.println(name.containsKey("Victor"));


        // или с помощью условной конструкции
        if (name.containsKey("Victor")){
            System.out.println("Виктор есть в списке");
        } else {
            System.out.println("Потеряли Виктора");
        }


    }


    }


