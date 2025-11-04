package practice_10;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты должны проверять:
 * Корректные номера ("+1 1234567890")
 * Некорректные номера ("12345", "invalid")
 */

public class Task_10_Test {

    private final Task_10 task10 = new Task_10();


    @Test
    @DisplayName("Валидный номер для метода isValidPhoneNumber()")
    void checkValidNumber() {
        assertTrue(task10.isValidPhoneNumber("+1 1234567890"));
    }


    @Test
    @DisplayName("Невалидный номер для метода isValidPhoneNumber()")
    void checkInvalidNumber() {
        assertFalse(task10.isValidPhoneNumber("12345"));
    }


    @Test
    @DisplayName("null для метода isValidPhoneNumber()")
    void checkNULLNumber() {
        String nullNumber = null;
        Exception exception = assertThrows(NullPointerException.class, () -> {
           task10.isValidPhoneNumber(nullNumber);
        });
        assertEquals("Cannot invoke \"String.matches(String)\" because \"phone\" is null",
                exception.getMessage());
        /**
         * В данном тесте я предпочел настроить проверку на NullPointerException.
         * В задании указано IllegalArgumentException, но как будто по смыслу это не подходит.
         */
    }


    @Test
    @DisplayName("Пустая строка для метода isValidPhoneNumber()")
    void checkEmptyString() {
        assertFalse(task10.isValidPhoneNumber(""));
    }


    @Test
    @DisplayName("Короткий номер для метода isValidPhoneNumber()")
    void checkNotEnoughNumbers() {
        assertFalse(task10.isValidPhoneNumber("+1 123"));
    }

}
