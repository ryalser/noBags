package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты:
 * Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
 * Список без чётных чисел
 * Пустой список
 */

public class Task_11_Test {


    private final Task_11 task11 = new Task_11();


    @Test
    @DisplayName("Обычный список для метода filterEvenNumbers()")
    void checkRegularList() {

        // Результат который валиден
        List <Integer> validResult = List.of(2,4,6);

        // Результат метода запишем в коллекцию
        List<Integer> evenNumbers = task11.filterEvenNumbers(List.of(1,2,3,4,5,6));
        // Ожидаю, что содержимое evenNumbers будет равно validResult
        assertEquals(evenNumbers,validResult,
                "Коллекция чисел должна содержать 2,4,6");
    }


    @Test
    @DisplayName("Список без чётных чисел для метода filterEvenNumbers()")
    void checkNotEvenNumbers() {
        assertEquals(List.of(),task11.filterEvenNumbers(List.of(1,3,5)));
        // Пустой список == [] т.к. метод filterEvenNumbers отбросит нечетные
    }


    @Test
    @DisplayName("Пустой список для метода filterEvenNumbers()")
    void checkEmptyList() {
        assertEquals(List.of(),task11.filterEvenNumbers(List.of()));
    }
}
