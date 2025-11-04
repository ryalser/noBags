package practice_8.streamapi_groupandreduce;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_1 {

    public static void main(String[] args) {

        List<String> name = List.of("Александр", "Виктор", "Иван", "Анна", "Алексей");


        // Создаем объект типа Map, куда запишем отсортированный по 1-му символу список
        Map <Character, List<String>>  groupName = name.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0) // Группируем по 0 символу элементы
                ));


        System.out.println(groupName);

    }
}
