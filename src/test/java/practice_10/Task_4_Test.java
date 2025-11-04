package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты должны проверять:
 * Обычный массив ([3, 5, 7, 2])
 * Один элемент в массиве
 * Отрицательные числа
 * Пустой массив (должно выбрасываться исключение)
 */

public class Task_4_Test {
    // Создаем экземпляр класса, который будем тестировать
    private final Task_4 task4 = new Task_4();


    @Test
    @DisplayName("Обычный массив в метод findMax()")
    void checkRegularArray(){
      int number [] = {1,2,3,4,5};
        assertEquals(5,task4.findMax(number),
                "Метод должен вернуть значение = 5");
    }


    @Test
    @DisplayName("Один элемент в массиве в метод findMax()")
    void checkOneElementInTheArray(){
        int number [] = {1};
        assertEquals(1,task4.findMax(number),
                "Метод должен вернуть значение = 1 т.к. это единственное значение");
    }


    @Test
    @DisplayName("Отрицательные числа в метод findMax()")
    void checkNegativeNumbersInArray(){
        int number [] = {-1,-2,-5};
        assertEquals(-1,task4.findMax(number),
                "Метод должен вернуть значение = -1");
    }


    @Test
    @DisplayName("Пустой массив в метод findMax()")
    void checkExceptionInEmptyArray(){
        int number [] = {}; // Массив пуст

        // Записываем исключение, которое поймали вызовом метода
    Exception exception = assertThrows(NoSuchElementException.class, () -> {
        task4.findMax(number);
    });
    // Сравниваем ожидаемое исключение с тем, что записали в exception
    assertEquals("No value present",exception.getMessage());
    };
}




