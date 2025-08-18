package practice_10;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты:
 * [1, 2, 3, 4, 5] → 3.0
 * [10] → 10.0
 * Пустой массив (должно выбрасываться исключение)
 */

public class Task_14_Test {

    private final Task_14 task14 = new Task_14();


    @Test
    @DisplayName("Нахождение среднего значения в findAverage()")
    void checkFindAvgValue() {
        int numbers[] = {1, 2, 3, 4, 5};
        assertEquals(3.0, task14.findAverage(numbers));
    }


    @Test
    @DisplayName("Одно число в массиве в findAverage()")
    void checkOneNumberInArray() {
        int numbers[] = {10};
        assertEquals(10, task14.findAverage(numbers));
    }


    @Test
    @DisplayName("Пустой массив в findAverage()")
    void checkEmptyArray() {
        int numbers[] = {};

        NoSuchElementException noSuchElementException = assertThrows(NoSuchElementException.class, () -> {
            task14.findAverage(numbers);
        });
        assertEquals("No value present",noSuchElementException.getMessage() );
    }
}
