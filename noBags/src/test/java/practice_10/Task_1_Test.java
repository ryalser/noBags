package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_1_Test {
    // Создаем экземпляр класса
    private final Task_1 task1 = new Task_1();


    @Test
    @DisplayName("Проверка isEven() при положительном четном числе")
    void checkEvenPositiveNumbers() {
        assertTrue(task1.isEven(10), "10 может быть только четным");
    }


    @Test
    @DisplayName("Проверка isEven() при положительном НЕ четном числе")
    void checkNotEvenPositiveNumbers() {
        assertFalse(task1.isEven(5), "5 может быть только НЕ четным");
    }


    @Test
    @DisplayName("Проверка isEven() при нулевом значении")
    void checkZeroValue() {
        assertTrue(task1.isEven(0), "0 может быть только четным");
    }


    @Test
    @DisplayName("Проверка isEven() при отрицательном значении")
    void checkNegativeValue() {
        assertTrue(task1.isEven(-10), "-10 должно быть четным");
    }
}
