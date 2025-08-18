package practice_10;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 24, 36 → 12
 * 101, 103 → 1
 * 0, 10 → 10
 */

public class Task_18_Test {

    private final Task_18 task18 = new Task_18();


    @Test
    @DisplayName("Проверка валидных аргументов: 4, 36 → 12 в методе gcd()")
    void checkTestValidValue() {
        assertEquals(12,task18.gcd(24,36),
                "Ожидаем: 12");
    }


    @Test
    @DisplayName("Проверка валидных аргументов: 4, 36 → 12  в методе gcd()")
    void checkTestValidValueNumTwo() {
        assertEquals(1,task18.gcd(101,103 ),
                "Ожидаем: 1");
    }


    @Test
    @DisplayName("Проверка валидных аргументов: 4, 36 → 12  в методе gcd()")
    void checkTestValidValueNumThree() {
        assertEquals(10,task18.gcd(0,10),
                "Ожидаем: 10");
    }


    @Test
    @DisplayName("Проверка невалидных значений: 4, 36 → 12")
    void checkNegativeTest() {
        assertEquals(0,task18.gcd(0,0),
                "Ожидаем: 0");
    }
}
