package practice_6.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task_1 {

    public static void main(String[] args) {


        // реализуем Map через TreeMap
        Map <String,Integer> stringMap = new TreeMap<>();

        // добавляем пары ключ-значение
        stringMap.put("Саша",5);
        stringMap.put("Витя",2);
        stringMap.put("Коля",4);
        stringMap.put("Даша",4);
        stringMap.put("Вика",1);


        // TreeMap сортирует данные по ключу, значит выведет ключи по алфавиту
        System.out.println(stringMap);


    }
}
