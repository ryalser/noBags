package practice_6.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {

    public static void main(String[] args) {


        // реализуем Map через HashMap
        Map<String, Integer> age = new HashMap<>();


        // добавляем пары ключ-значение
        age.put("Ivan",15);
        age.put("Sergey",22);
        age.put("Sasha",25);
        age.put("Petr",63);
        age.put("Victor",44);

        System.out.println(age);


    }
}
