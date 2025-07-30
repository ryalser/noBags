package practice_6.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {

        Set<String> strings = new LinkedHashSet<>();

        strings.add("Строка 1");
        strings.add("Строка 2");
        strings.add("Строка 3");
        strings.add("Строка 4");


        // LinkedHashSet выводит по порядку добавленные элементы
        System.out.println(strings);




    }
}
