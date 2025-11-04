package practice_10;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты:
 * "listen", "silent" → true
 * "java", "python" → false
 * null → false
 */

public class Task_13_Test {

    private final Task_13 task13 = new Task_13();


    @Test
    @DisplayName("Полностью валидные данные в метод isAnagram()")
    void checkAnagram() {
        assertTrue(task13.isAnagram("listen","silent"));
    }


    @Test
    @DisplayName("Слова - не анаграммы в метод isAnagram()")
    void checkNotAnagram() {
        assertFalse(task13.isAnagram("java","python"));
    }


    @Test
    @DisplayName("null для метода анаграмм в метод isAnagram()")
    void checkNULLAnagram() {
       assertFalse(task13.isAnagram(null,"silent"));
    }
}
