package practice_8.streamapi_groupandreduce;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_2_3 {
    public static void main(String[] args) {

        List <Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // Объект Map
        Map<Boolean, List<Integer>> groupNumbers = numbers.stream()
                .collect(Collectors.groupingBy(
                        num -> num % 2 == 0 // Передаем в ключ условие
                ));



        // В переменную запишем результат стрима
        double avgValue = numbers.stream()
                .collect(Collectors.averagingDouble(num -> num)); // Вычисляем среднее из элементов коллекции


        System.out.println("Список отсортированных значений: " + groupNumbers);
        System.out.println("Среднее всех значений " + avgValue);


    }
}
