package practice_6.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Task_1 {

    public static void main(String[] args) {


        List <String> strings = new LinkedList<>();


        strings.add("Строка 1");
        strings.add("Строка 2");
        strings.add("Строка 3");

        // выводим всю коллекцию
        System.out.println(strings);

        // выводим каждый элемент циклом
        for (String str : strings){
            System.out.println(str);
        }




    }
}
