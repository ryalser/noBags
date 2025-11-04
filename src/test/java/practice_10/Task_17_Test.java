package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * "Password1" → true
 * "pass" → false
 * null → false
 */

public class Task_17_Test {

    private final Task_17 task17 = new Task_17();


    @Test
    @DisplayName("Валидный пароль в isValidPassword()")
    void checkValidPassword() {
        assertTrue(task17.isValidPassword("Password1"),
                "Ожидаем: true");
    }


    @Test
    @DisplayName("Невалидный пароль в isValidPassword()")
    void checkInValidPassword() {
        assertFalse(task17.isValidPassword("pass"),
                "Ожидаем: false");
    }

    @Test
    @DisplayName("Проверка на null в isValidPassword()")
    void checkNULLPassword() {
        assertFalse(task17.isValidPassword(null),
                "Ожидаем: false");
    }
}
