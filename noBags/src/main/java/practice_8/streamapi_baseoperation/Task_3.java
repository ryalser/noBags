package practice_8.streamapi_baseoperation;

import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {

        // коллекция строк
        List<String> stringList = List.of("1234","12345","1234567","1","2","1");


        // коллекция для записи значений прошедших фильтр
        List<Integer>  stringToLength=  stringList.stream()
                .map(str ->  str.length()) // фильтруем по длине
                .collect(Collectors.toList()); // преобразуем в список

        System.out.println(stringToLength);
    }


 }

