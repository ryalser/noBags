package practice_8.streamapi_agregateoperation;


import java.util.List;
import java.util.OptionalInt;

public class Task_1_2_3 {
    public static void main(String[] args) {

        // Список чисел
        List<Integer> numbers = List.of(1,2,3,4,5);


        // Объект OptionalInt, который получит максимальное число (или будет пустым)
        OptionalInt maxValue = numbers.stream()
                        .mapToInt(Integer::intValue) // Преобразуем в int
                                .max(); // Получаем максимальное значение


        // Объект OptionalInt, который получит минимальное число (или будет пустым)
        OptionalInt minValue = numbers.stream()
                        .mapToInt(Integer::intValue)
                                .min();


        // результат стрима запишем в переменную
        int sumValue = numbers.stream()
                        .mapToInt(Integer::intValue) // Преобразуем элементы в int
                                .sum(); // Считаем сумму

        System.out.println(
          "Максимальное значение списка numbers = " + maxValue + "\n"
        + "Минимальное значение списка numbers = " + minValue + "\n"
        + "Сумма элементов numbers = " + sumValue
        );



    }
}
