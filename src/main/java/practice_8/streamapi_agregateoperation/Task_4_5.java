package practice_8.streamapi_agregateoperation;

import java.util.List;

public class Task_4_5 {
    public static void main(String[] args) {

        // Список чисел
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // В переменную типа boolean запишем результат стрима
        boolean isEvenNumber = numbers.stream()
                .anyMatch(num -> num % 2 == 0); // Есть ли число, которое является четным?

        if (isEvenNumber){
            System.out.println("Есть четные числа");
        }

    }
}
