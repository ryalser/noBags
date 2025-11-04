package practice_10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты должны проверять:
 * Обычные годы
 * Високосные (2020, 2000, 1600)
 * Года, которые делятся на 100, но не на 400 (1900, 2100)
 */

public class Task_5_Test {

    private final Task_5 task5 = new Task_5();


    @Test
    @DisplayName("Обычные годы в метод isLeapYear()")
    void checkOrdinaryYear(){
        int year = 2025;
        assertFalse(task5.isLeapYear(year));
    }


    @Test
    @DisplayName("Високосные в метод isLeapYear()")
    void checkLeapYear(){
        int year = 2000;
        assertTrue(task5.isLeapYear(year));
    }


    @Test
    @DisplayName("Года, которые делятся на 100, но не на 400  в метод isLeapYear()")
    void checkYearNotDivisibleBy400(){
        int year = 1900;
        assertFalse(task5.isLeapYear(year));
    }
}
