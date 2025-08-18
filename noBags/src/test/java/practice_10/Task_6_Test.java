package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты должны проверять:
 * Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
 * null
 */

public class Task_6_Test {

    private final Task_6 task6 = new Task_6();


    @Test
    @DisplayName("Корректные email в метод isValidEmail()")
    void checkCorrectEmail (){
        String correctEmail = "test@example.com";
        assertTrue(task6.isValidEmail(correctEmail));
    }


    @Test
    @DisplayName("Некорректные email в метод isValidEmail()")
    void checkNotCorrectEmail (){
        String invalidEmail = "bad@.com";
        assertFalse(task6.isValidEmail(invalidEmail));
    }


    @Test
    @DisplayName("Проверка на null в методe isValidEmail()")
    void checkNULLEmail(){
        String emptyEmail = "";
        String nullEmail = null;
        assertFalse(task6.isValidEmail(emptyEmail));
        assertFalse(task6.isValidEmail(nullEmail));
    }
}
