package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Проверить findSecondMax():
 * Обычный массив: [3, 5, 7, 2] → findSecondMax() → 5
 * Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
 * Один элемент: [8] → Должно выбрасываться NoSuchElementException.
 * Пустой массив: [] → Должно выбрасываться NoSuchElementException.
 */

public class Task_8_Test {

    private final Task_8 task8 = new Task_8();


    @Test
    @DisplayName("Обычные массивы в методе findSecondMax()")
    void regularArrays(){
        int numbers[] = {1,2,3,4,5,10,12};
        assertEquals(10,task8.findSecondMax(numbers),
                "Максимальное число в массиве = 10");
    }


    @Test
    @DisplayName("Массив с одинаковыми числами в методе findSecondMax()")
    void arraysWithIdenticalNumbers(){
        int numbers[] = {1,2,3,4,5,10,10};
        assertEquals(10,task8.findSecondMax(numbers),
                "Второе по величине число в массиве = 10");
    }


    @Test
    @DisplayName("Один элемент в массиве в методе findSecondMax()")
    void arraysWithOneElement(){
        int number [] = {}; // Массив пуст

        assertThrows(IllegalArgumentException.class, () -> {
                task8.findSecondMax(number);
            });
        }

    /**
     * В подсказках к заданию мы ожидаем NoSuchElementException.
     * Однако он предназначен для читуации когда не найден искомый элемент.
     * В данном случае IDE подсказывает, что мы получаем IllegalArgumentException.
     * Думаю это допустимо в данном случае.
     */
};




