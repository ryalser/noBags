package practice_10;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты:
 * [1, 2, 3, 4, 5] → false
 * [1, 2, 2, 3] → true
 * Пустой массив → false
 */

public class Task_20_Test {

    private final Task_20 task20 = new Task_20();


    @Test
    @DisplayName("Проверка на отсутствие дубликатов методом hasDuplicates()")
    void checkNotDuplicate() {
        int [] arrayNotDuplicate = {1,2,3,4,5};
        assertFalse(task20.hasDuplicates(arrayNotDuplicate));
    }


    @Test
    @DisplayName("Проверка на  дубликаты методом hasDuplicates()")
    void checkDuplicate() {
        int [] arrayDuplicate = {1,2,2,3};
        assertTrue(task20.hasDuplicates(arrayDuplicate));
    }


    @Test
    @DisplayName("Проверка на пустой массив методом hasDuplicates()")
    void checkEmptyArray() {
        int [] emptyArray = {};
        assertFalse(task20.hasDuplicates(emptyArray));
    }

}
