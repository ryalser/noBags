package practice_8.streamapi_baseoperation;

import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {

    public static void main(String[] args) {


        // коллекция строк
        List<String> stringList = List.of("1234","12345","1234567","12","1","1");


        // коллекция для записи значений прошедших фильтр
        List<String> filterList =  stringList.stream()
                .filter(str -> str.length() > 5) // фильтруем по длине
                .collect(Collectors.toList()); // преобразуем в список

        System.out.println(filterList);
    }
}
